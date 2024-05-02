package com.dao;

import com.entity.ZhongzhiyonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzhiyonghuVO;
import com.entity.view.ZhongzhiyonghuView;


/**
 * 种植用户
 * 
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public interface ZhongzhiyonghuDao extends BaseMapper<ZhongzhiyonghuEntity> {
	
	List<ZhongzhiyonghuVO> selectListVO(@Param("ew") Wrapper<ZhongzhiyonghuEntity> wrapper);
	
	ZhongzhiyonghuVO selectVO(@Param("ew") Wrapper<ZhongzhiyonghuEntity> wrapper);
	
	List<ZhongzhiyonghuView> selectListView(@Param("ew") Wrapper<ZhongzhiyonghuEntity> wrapper);

	List<ZhongzhiyonghuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzhiyonghuEntity> wrapper);
	
	ZhongzhiyonghuView selectView(@Param("ew") Wrapper<ZhongzhiyonghuEntity> wrapper);
	
}
