package com.dao;

import com.entity.DiscusszaishounongchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszaishounongchanpinVO;
import com.entity.view.DiscusszaishounongchanpinView;


/**
 * 在售农产品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface DiscusszaishounongchanpinDao extends BaseMapper<DiscusszaishounongchanpinEntity> {
	
	List<DiscusszaishounongchanpinVO> selectListVO(@Param("ew") Wrapper<DiscusszaishounongchanpinEntity> wrapper);
	
	DiscusszaishounongchanpinVO selectVO(@Param("ew") Wrapper<DiscusszaishounongchanpinEntity> wrapper);
	
	List<DiscusszaishounongchanpinView> selectListView(@Param("ew") Wrapper<DiscusszaishounongchanpinEntity> wrapper);

	List<DiscusszaishounongchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszaishounongchanpinEntity> wrapper);
	
	DiscusszaishounongchanpinView selectView(@Param("ew") Wrapper<DiscusszaishounongchanpinEntity> wrapper);
	
}
