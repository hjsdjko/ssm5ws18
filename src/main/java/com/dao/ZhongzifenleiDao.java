package com.dao;

import com.entity.ZhongzifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzifenleiVO;
import com.entity.view.ZhongzifenleiView;


/**
 * 种子分类
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface ZhongzifenleiDao extends BaseMapper<ZhongzifenleiEntity> {
	
	List<ZhongzifenleiVO> selectListVO(@Param("ew") Wrapper<ZhongzifenleiEntity> wrapper);
	
	ZhongzifenleiVO selectVO(@Param("ew") Wrapper<ZhongzifenleiEntity> wrapper);
	
	List<ZhongzifenleiView> selectListView(@Param("ew") Wrapper<ZhongzifenleiEntity> wrapper);

	List<ZhongzifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzifenleiEntity> wrapper);
	
	ZhongzifenleiView selectView(@Param("ew") Wrapper<ZhongzifenleiEntity> wrapper);
	
}
