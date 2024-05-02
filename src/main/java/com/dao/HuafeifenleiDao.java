package com.dao;

import com.entity.HuafeifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuafeifenleiVO;
import com.entity.view.HuafeifenleiView;


/**
 * 化肥分类
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface HuafeifenleiDao extends BaseMapper<HuafeifenleiEntity> {
	
	List<HuafeifenleiVO> selectListVO(@Param("ew") Wrapper<HuafeifenleiEntity> wrapper);
	
	HuafeifenleiVO selectVO(@Param("ew") Wrapper<HuafeifenleiEntity> wrapper);
	
	List<HuafeifenleiView> selectListView(@Param("ew") Wrapper<HuafeifenleiEntity> wrapper);

	List<HuafeifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<HuafeifenleiEntity> wrapper);
	
	HuafeifenleiView selectView(@Param("ew") Wrapper<HuafeifenleiEntity> wrapper);
	
}
