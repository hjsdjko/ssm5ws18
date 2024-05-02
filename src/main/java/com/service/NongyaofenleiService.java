package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyaofenleiView;


/**
 * 农药分类
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyaofenleiService extends IService<NongyaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyaofenleiVO> selectListVO(Wrapper<NongyaofenleiEntity> wrapper);
   	
   	NongyaofenleiVO selectVO(@Param("ew") Wrapper<NongyaofenleiEntity> wrapper);
   	
   	List<NongyaofenleiView> selectListView(Wrapper<NongyaofenleiEntity> wrapper);
   	
   	NongyaofenleiView selectView(@Param("ew") Wrapper<NongyaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyaofenleiEntity> wrapper);
   	
}

