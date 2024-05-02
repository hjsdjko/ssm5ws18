package com.dao;

import com.entity.NongyenongyaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyenongyaoVO;
import com.entity.view.NongyenongyaoView;


/**
 * 农业农药
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyenongyaoDao extends BaseMapper<NongyenongyaoEntity> {
	
	List<NongyenongyaoVO> selectListVO(@Param("ew") Wrapper<NongyenongyaoEntity> wrapper);
	
	NongyenongyaoVO selectVO(@Param("ew") Wrapper<NongyenongyaoEntity> wrapper);
	
	List<NongyenongyaoView> selectListView(@Param("ew") Wrapper<NongyenongyaoEntity> wrapper);

	List<NongyenongyaoView> selectListView(Pagination page,@Param("ew") Wrapper<NongyenongyaoEntity> wrapper);
	
	NongyenongyaoView selectView(@Param("ew") Wrapper<NongyenongyaoEntity> wrapper);
	
}
