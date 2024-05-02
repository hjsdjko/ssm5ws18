package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchanpingongqiuliangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchanpingongqiuliangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchanpingongqiuliangView;


/**
 * 农产品供求量
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongchanpingongqiuliangService extends IService<NongchanpingongqiuliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchanpingongqiuliangVO> selectListVO(Wrapper<NongchanpingongqiuliangEntity> wrapper);
   	
   	NongchanpingongqiuliangVO selectVO(@Param("ew") Wrapper<NongchanpingongqiuliangEntity> wrapper);
   	
   	List<NongchanpingongqiuliangView> selectListView(Wrapper<NongchanpingongqiuliangEntity> wrapper);
   	
   	NongchanpingongqiuliangView selectView(@Param("ew") Wrapper<NongchanpingongqiuliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchanpingongqiuliangEntity> wrapper);
   	
}

