package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyeyonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyeyonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyeyonghuView;


/**
 * 企业用户
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface QiyeyonghuService extends IService<QiyeyonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyeyonghuVO> selectListVO(Wrapper<QiyeyonghuEntity> wrapper);
   	
   	QiyeyonghuVO selectVO(@Param("ew") Wrapper<QiyeyonghuEntity> wrapper);
   	
   	List<QiyeyonghuView> selectListView(Wrapper<QiyeyonghuEntity> wrapper);
   	
   	QiyeyonghuView selectView(@Param("ew") Wrapper<QiyeyonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyeyonghuEntity> wrapper);
   	
}

