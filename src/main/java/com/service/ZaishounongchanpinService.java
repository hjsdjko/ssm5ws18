package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaishounongchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaishounongchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaishounongchanpinView;


/**
 * 在售农产品
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface ZaishounongchanpinService extends IService<ZaishounongchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaishounongchanpinVO> selectListVO(Wrapper<ZaishounongchanpinEntity> wrapper);
   	
   	ZaishounongchanpinVO selectVO(@Param("ew") Wrapper<ZaishounongchanpinEntity> wrapper);
   	
   	List<ZaishounongchanpinView> selectListView(Wrapper<ZaishounongchanpinEntity> wrapper);
   	
   	ZaishounongchanpinView selectView(@Param("ew") Wrapper<ZaishounongchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaishounongchanpinEntity> wrapper);
   	
}

