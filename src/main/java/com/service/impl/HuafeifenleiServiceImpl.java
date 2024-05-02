package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuafeifenleiDao;
import com.entity.HuafeifenleiEntity;
import com.service.HuafeifenleiService;
import com.entity.vo.HuafeifenleiVO;
import com.entity.view.HuafeifenleiView;

@Service("huafeifenleiService")
public class HuafeifenleiServiceImpl extends ServiceImpl<HuafeifenleiDao, HuafeifenleiEntity> implements HuafeifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuafeifenleiEntity> page = this.selectPage(
                new Query<HuafeifenleiEntity>(params).getPage(),
                new EntityWrapper<HuafeifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuafeifenleiEntity> wrapper) {
		  Page<HuafeifenleiView> page =new Query<HuafeifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuafeifenleiVO> selectListVO(Wrapper<HuafeifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuafeifenleiVO selectVO(Wrapper<HuafeifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuafeifenleiView> selectListView(Wrapper<HuafeifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuafeifenleiView selectView(Wrapper<HuafeifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
