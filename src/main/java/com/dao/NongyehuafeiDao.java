package com.dao;

import com.entity.NongyehuafeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyehuafeiVO;
import com.entity.view.NongyehuafeiView;


/**
 * 农业化肥
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongyehuafeiDao extends BaseMapper<NongyehuafeiEntity> {
	
	List<NongyehuafeiVO> selectListVO(@Param("ew") Wrapper<NongyehuafeiEntity> wrapper);
	
	NongyehuafeiVO selectVO(@Param("ew") Wrapper<NongyehuafeiEntity> wrapper);
	
	List<NongyehuafeiView> selectListView(@Param("ew") Wrapper<NongyehuafeiEntity> wrapper);

	List<NongyehuafeiView> selectListView(Pagination page,@Param("ew") Wrapper<NongyehuafeiEntity> wrapper);
	
	NongyehuafeiView selectView(@Param("ew") Wrapper<NongyehuafeiEntity> wrapper);
	
}
