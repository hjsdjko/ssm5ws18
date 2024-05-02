package com.dao;

import com.entity.NongyaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyaofenleiVO;
import com.entity.view.NongyaofenleiView;


/**
 * 农药分类
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyaofenleiDao extends BaseMapper<NongyaofenleiEntity> {
	
	List<NongyaofenleiVO> selectListVO(@Param("ew") Wrapper<NongyaofenleiEntity> wrapper);
	
	NongyaofenleiVO selectVO(@Param("ew") Wrapper<NongyaofenleiEntity> wrapper);
	
	List<NongyaofenleiView> selectListView(@Param("ew") Wrapper<NongyaofenleiEntity> wrapper);

	List<NongyaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<NongyaofenleiEntity> wrapper);
	
	NongyaofenleiView selectView(@Param("ew") Wrapper<NongyaofenleiEntity> wrapper);
	
}
