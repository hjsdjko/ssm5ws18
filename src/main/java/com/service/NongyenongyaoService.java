package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyenongyaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyenongyaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyenongyaoView;


/**
 * 农业农药
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyenongyaoService extends IService<NongyenongyaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyenongyaoVO> selectListVO(Wrapper<NongyenongyaoEntity> wrapper);
   	
   	NongyenongyaoVO selectVO(@Param("ew") Wrapper<NongyenongyaoEntity> wrapper);
   	
   	List<NongyenongyaoView> selectListView(Wrapper<NongyenongyaoEntity> wrapper);
   	
   	NongyenongyaoView selectView(@Param("ew") Wrapper<NongyenongyaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyenongyaoEntity> wrapper);
   	
}

