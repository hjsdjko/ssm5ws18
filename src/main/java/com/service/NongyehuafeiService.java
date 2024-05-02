package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyehuafeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyehuafeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyehuafeiView;


/**
 * 农业化肥
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyehuafeiService extends IService<NongyehuafeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyehuafeiVO> selectListVO(Wrapper<NongyehuafeiEntity> wrapper);
   	
   	NongyehuafeiVO selectVO(@Param("ew") Wrapper<NongyehuafeiEntity> wrapper);
   	
   	List<NongyehuafeiView> selectListView(Wrapper<NongyehuafeiEntity> wrapper);
   	
   	NongyehuafeiView selectView(@Param("ew") Wrapper<NongyehuafeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyehuafeiEntity> wrapper);
   	
}

