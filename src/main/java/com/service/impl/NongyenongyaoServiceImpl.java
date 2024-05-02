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


import com.dao.NongyenongyaoDao;
import com.entity.NongyenongyaoEntity;
import com.service.NongyenongyaoService;
import com.entity.vo.NongyenongyaoVO;
import com.entity.view.NongyenongyaoView;

@Service("nongyenongyaoService")
public class NongyenongyaoServiceImpl extends ServiceImpl<NongyenongyaoDao, NongyenongyaoEntity> implements NongyenongyaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyenongyaoEntity> page = this.selectPage(
                new Query<NongyenongyaoEntity>(params).getPage(),
                new EntityWrapper<NongyenongyaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyenongyaoEntity> wrapper) {
		  Page<NongyenongyaoView> page =new Query<NongyenongyaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyenongyaoVO> selectListVO(Wrapper<NongyenongyaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyenongyaoVO selectVO(Wrapper<NongyenongyaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyenongyaoView> selectListView(Wrapper<NongyenongyaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyenongyaoView selectView(Wrapper<NongyenongyaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
