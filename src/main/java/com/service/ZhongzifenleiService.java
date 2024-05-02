package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzifenleiView;


/**
 * 种子分类
 *
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface ZhongzifenleiService extends IService<ZhongzifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzifenleiVO> selectListVO(Wrapper<ZhongzifenleiEntity> wrapper);
   	
   	ZhongzifenleiVO selectVO(@Param("ew") Wrapper<ZhongzifenleiEntity> wrapper);
   	
   	List<ZhongzifenleiView> selectListView(Wrapper<ZhongzifenleiEntity> wrapper);
   	
   	ZhongzifenleiView selectView(@Param("ew") Wrapper<ZhongzifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzifenleiEntity> wrapper);
   	
}

