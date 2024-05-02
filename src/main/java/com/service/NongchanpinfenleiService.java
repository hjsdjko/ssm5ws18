package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchanpinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchanpinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchanpinfenleiView;


/**
 * 农产品分类
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongchanpinfenleiService extends IService<NongchanpinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchanpinfenleiVO> selectListVO(Wrapper<NongchanpinfenleiEntity> wrapper);
   	
   	NongchanpinfenleiVO selectVO(@Param("ew") Wrapper<NongchanpinfenleiEntity> wrapper);
   	
   	List<NongchanpinfenleiView> selectListView(Wrapper<NongchanpinfenleiEntity> wrapper);
   	
   	NongchanpinfenleiView selectView(@Param("ew") Wrapper<NongchanpinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchanpinfenleiEntity> wrapper);
   	
}

