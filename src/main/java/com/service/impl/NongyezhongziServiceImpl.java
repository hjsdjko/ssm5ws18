package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NongyezhongziDao;
import com.entity.NongyezhongziEntity;
import com.service.NongyezhongziService;
import com.entity.vo.NongyezhongziVO;
import com.entity.view.NongyezhongziView;

@Service("nongyezhongziService")
public class NongyezhongziServiceImpl extends ServiceImpl<NongyezhongziDao, NongyezhongziEntity> implements NongyezhongziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyezhongziEntity> page = this.selectPage(
                new Query<NongyezhongziEntity>(params).getPage(),
                new EntityWrapper<NongyezhongziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyezhongziEntity> wrapper) {
		  Page<NongyezhongziView> page =new Query<NongyezhongziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyezhongziVO> selectListVO(Wrapper<NongyezhongziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyezhongziVO selectVO(Wrapper<NongyezhongziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyezhongziView> selectListView(Wrapper<NongyezhongziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyezhongziView selectView(Wrapper<NongyezhongziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
