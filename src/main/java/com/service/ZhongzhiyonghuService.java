package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzhiyonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzhiyonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzhiyonghuView;


/**
 * 种植用户
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface ZhongzhiyonghuService extends IService<ZhongzhiyonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhiyonghuVO> selectListVO(Wrapper<ZhongzhiyonghuEntity> wrapper);
   	
   	ZhongzhiyonghuVO selectVO(@Param("ew") Wrapper<ZhongzhiyonghuEntity> wrapper);
   	
   	List<ZhongzhiyonghuView> selectListView(Wrapper<ZhongzhiyonghuEntity> wrapper);
   	
   	ZhongzhiyonghuView selectView(@Param("ew") Wrapper<ZhongzhiyonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhiyonghuEntity> wrapper);
   	
}

