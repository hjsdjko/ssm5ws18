package com.dao;

import com.entity.ZaishounongchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaishounongchanpinVO;
import com.entity.view.ZaishounongchanpinView;


/**
 * 在售农产品
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface ZaishounongchanpinDao extends BaseMapper<ZaishounongchanpinEntity> {
	
	List<ZaishounongchanpinVO> selectListVO(@Param("ew") Wrapper<ZaishounongchanpinEntity> wrapper);
	
	ZaishounongchanpinVO selectVO(@Param("ew") Wrapper<ZaishounongchanpinEntity> wrapper);
	
	List<ZaishounongchanpinView> selectListView(@Param("ew") Wrapper<ZaishounongchanpinEntity> wrapper);

	List<ZaishounongchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<ZaishounongchanpinEntity> wrapper);
	
	ZaishounongchanpinView selectView(@Param("ew") Wrapper<ZaishounongchanpinEntity> wrapper);
	
}
