package com.dao;

import com.entity.NongyejishuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyejishuVO;
import com.entity.view.NongyejishuView;


/**
 * 农业技术
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyejishuDao extends BaseMapper<NongyejishuEntity> {
	
	List<NongyejishuVO> selectListVO(@Param("ew") Wrapper<NongyejishuEntity> wrapper);
	
	NongyejishuVO selectVO(@Param("ew") Wrapper<NongyejishuEntity> wrapper);
	
	List<NongyejishuView> selectListView(@Param("ew") Wrapper<NongyejishuEntity> wrapper);

	List<NongyejishuView> selectListView(Pagination page,@Param("ew") Wrapper<NongyejishuEntity> wrapper);
	
	NongyejishuView selectView(@Param("ew") Wrapper<NongyejishuEntity> wrapper);
	
}
