package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchanpinjiageEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchanpinjiageVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchanpinjiageView;


/**
 * 农产品价格
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongchanpinjiageService extends IService<NongchanpinjiageEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchanpinjiageVO> selectListVO(Wrapper<NongchanpinjiageEntity> wrapper);
   	
   	NongchanpinjiageVO selectVO(@Param("ew") Wrapper<NongchanpinjiageEntity> wrapper);
   	
   	List<NongchanpinjiageView> selectListView(Wrapper<NongchanpinjiageEntity> wrapper);
   	
   	NongchanpinjiageView selectView(@Param("ew") Wrapper<NongchanpinjiageEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchanpinjiageEntity> wrapper);
   	
}

