package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyejishuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyejishuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyejishuView;


/**
 * 农业技术
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyejishuService extends IService<NongyejishuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyejishuVO> selectListVO(Wrapper<NongyejishuEntity> wrapper);
   	
   	NongyejishuVO selectVO(@Param("ew") Wrapper<NongyejishuEntity> wrapper);
   	
   	List<NongyejishuView> selectListView(Wrapper<NongyejishuEntity> wrapper);
   	
   	NongyejishuView selectView(@Param("ew") Wrapper<NongyejishuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyejishuEntity> wrapper);
   	
}

