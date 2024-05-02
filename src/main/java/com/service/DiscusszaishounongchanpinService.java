package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaishounongchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaishounongchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaishounongchanpinView;


/**
 * 在售农产品评论表
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface DiscusszaishounongchanpinService extends IService<DiscusszaishounongchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaishounongchanpinVO> selectListVO(Wrapper<DiscusszaishounongchanpinEntity> wrapper);
   	
   	DiscusszaishounongchanpinVO selectVO(@Param("ew") Wrapper<DiscusszaishounongchanpinEntity> wrapper);
   	
   	List<DiscusszaishounongchanpinView> selectListView(Wrapper<DiscusszaishounongchanpinEntity> wrapper);
   	
   	DiscusszaishounongchanpinView selectView(@Param("ew") Wrapper<DiscusszaishounongchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaishounongchanpinEntity> wrapper);
   	
}

