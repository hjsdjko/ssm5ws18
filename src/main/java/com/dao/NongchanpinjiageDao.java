package com.dao;

import com.entity.NongchanpinjiageEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchanpinjiageVO;
import com.entity.view.NongchanpinjiageView;


/**
 * 农产品价格
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongchanpinjiageDao extends BaseMapper<NongchanpinjiageEntity> {
	
	List<NongchanpinjiageVO> selectListVO(@Param("ew") Wrapper<NongchanpinjiageEntity> wrapper);
	
	NongchanpinjiageVO selectVO(@Param("ew") Wrapper<NongchanpinjiageEntity> wrapper);
	
	List<NongchanpinjiageView> selectListView(@Param("ew") Wrapper<NongchanpinjiageEntity> wrapper);

	List<NongchanpinjiageView> selectListView(Pagination page,@Param("ew") Wrapper<NongchanpinjiageEntity> wrapper);
	
	NongchanpinjiageView selectView(@Param("ew") Wrapper<NongchanpinjiageEntity> wrapper);
	
}
