package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZaishounongchanpinEntity;
import com.entity.view.ZaishounongchanpinView;

import com.service.ZaishounongchanpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 在售农产品
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@RestController
@RequestMapping("/zaishounongchanpin")
public class ZaishounongchanpinController {
    @Autowired
    private ZaishounongchanpinService zaishounongchanpinService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZaishounongchanpinEntity zaishounongchanpin, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhongzhiyonghu")) {
			zaishounongchanpin.setZhongzhizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZaishounongchanpinEntity> ew = new EntityWrapper<ZaishounongchanpinEntity>();
		PageUtils page = zaishounongchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaishounongchanpin), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZaishounongchanpinEntity zaishounongchanpin, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhongzhiyonghu")) {
			zaishounongchanpin.setZhongzhizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZaishounongchanpinEntity> ew = new EntityWrapper<ZaishounongchanpinEntity>();
		PageUtils page = zaishounongchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaishounongchanpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZaishounongchanpinEntity zaishounongchanpin){
       	EntityWrapper<ZaishounongchanpinEntity> ew = new EntityWrapper<ZaishounongchanpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zaishounongchanpin, "zaishounongchanpin")); 
        return R.ok().put("data", zaishounongchanpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZaishounongchanpinEntity zaishounongchanpin){
        EntityWrapper< ZaishounongchanpinEntity> ew = new EntityWrapper< ZaishounongchanpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zaishounongchanpin, "zaishounongchanpin")); 
		ZaishounongchanpinView zaishounongchanpinView =  zaishounongchanpinService.selectView(ew);
		return R.ok("查询在售农产品成功").put("data", zaishounongchanpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZaishounongchanpinEntity zaishounongchanpin = zaishounongchanpinService.selectById(id);
        return R.ok().put("data", zaishounongchanpin);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZaishounongchanpinEntity zaishounongchanpin = zaishounongchanpinService.selectById(id);
        return R.ok().put("data", zaishounongchanpin);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        ZaishounongchanpinEntity zaishounongchanpin = zaishounongchanpinService.selectById(id);
        if(type.equals("1")) {
        	zaishounongchanpin.setThumbsupnum(zaishounongchanpin.getThumbsupnum()+1);
        } else {
        	zaishounongchanpin.setCrazilynum(zaishounongchanpin.getCrazilynum()+1);
        }
        zaishounongchanpinService.updateById(zaishounongchanpin);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZaishounongchanpinEntity zaishounongchanpin, HttpServletRequest request){
    	zaishounongchanpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaishounongchanpin);

        zaishounongchanpinService.insert(zaishounongchanpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZaishounongchanpinEntity zaishounongchanpin, HttpServletRequest request){
    	zaishounongchanpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaishounongchanpin);
    	zaishounongchanpin.setUserid((Long)request.getSession().getAttribute("userId"));

        zaishounongchanpinService.insert(zaishounongchanpin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZaishounongchanpinEntity zaishounongchanpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zaishounongchanpin);
        zaishounongchanpinService.updateById(zaishounongchanpin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zaishounongchanpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZaishounongchanpinEntity> wrapper = new EntityWrapper<ZaishounongchanpinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhongzhiyonghu")) {
			wrapper.eq("zhongzhizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zaishounongchanpinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
