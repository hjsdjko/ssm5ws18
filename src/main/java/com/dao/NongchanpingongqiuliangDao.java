package com.dao;

import com.entity.NongchanpingongqiuliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchanpingongqiuliangVO;
import com.entity.view.NongchanpingongqiuliangView;


/**
 * 农产品供求量
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface NongchanpingongqiuliangDao extends BaseMapper<NongchanpingongqiuliangEntity> {
	
	List<NongchanpingongqiuliangVO> selectListVO(@Param("ew") Wrapper<NongchanpingongqiuliangEntity> wrapper);
	
	NongchanpingongqiuliangVO selectVO(@Param("ew") Wrapper<NongchanpingongqiuliangEntity> wrapper);
	
	List<NongchanpingongqiuliangView> selectListView(@Param("ew") Wrapper<NongchanpingongqiuliangEntity> wrapper);

	List<NongchanpingongqiuliangView> selectListView(Pagination page,@Param("ew") Wrapper<NongchanpingongqiuliangEntity> wrapper);
	
	NongchanpingongqiuliangView selectView(@Param("ew") Wrapper<NongchanpingongqiuliangEntity> wrapper);
	
}
