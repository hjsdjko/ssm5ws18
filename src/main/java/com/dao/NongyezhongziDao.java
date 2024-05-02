package com.dao;

import com.entity.NongyezhongziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyezhongziVO;
import com.entity.view.NongyezhongziView;


/**
 * 农业种子
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyezhongziDao extends BaseMapper<NongyezhongziEntity> {
	
	List<NongyezhongziVO> selectListVO(@Param("ew") Wrapper<NongyezhongziEntity> wrapper);
	
	NongyezhongziVO selectVO(@Param("ew") Wrapper<NongyezhongziEntity> wrapper);
	
	List<NongyezhongziView> selectListView(@Param("ew") Wrapper<NongyezhongziEntity> wrapper);

	List<NongyezhongziView> selectListView(Pagination page,@Param("ew") Wrapper<NongyezhongziEntity> wrapper);
	
	NongyezhongziView selectView(@Param("ew") Wrapper<NongyezhongziEntity> wrapper);
	
}
