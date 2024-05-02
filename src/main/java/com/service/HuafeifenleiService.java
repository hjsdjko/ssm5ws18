package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuafeifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuafeifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuafeifenleiView;


/**
 * 化肥分类
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface HuafeifenleiService extends IService<HuafeifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuafeifenleiVO> selectListVO(Wrapper<HuafeifenleiEntity> wrapper);
   	
   	HuafeifenleiVO selectVO(@Param("ew") Wrapper<HuafeifenleiEntity> wrapper);
   	
   	List<HuafeifenleiView> selectListView(Wrapper<HuafeifenleiEntity> wrapper);
   	
   	HuafeifenleiView selectView(@Param("ew") Wrapper<HuafeifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuafeifenleiEntity> wrapper);
   	
}

