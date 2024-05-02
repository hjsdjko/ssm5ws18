package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyezhongziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyezhongziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyezhongziView;


/**
 * 农业种子
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyezhongziService extends IService<NongyezhongziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyezhongziVO> selectListVO(Wrapper<NongyezhongziEntity> wrapper);
   	
   	NongyezhongziVO selectVO(@Param("ew") Wrapper<NongyezhongziEntity> wrapper);
   	
   	List<NongyezhongziView> selectListView(Wrapper<NongyezhongziEntity> wrapper);
   	
   	NongyezhongziView selectView(@Param("ew") Wrapper<NongyezhongziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyezhongziEntity> wrapper);
   	
}

