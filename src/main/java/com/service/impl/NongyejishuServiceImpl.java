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


import com.dao.NongyejishuDao;
import com.entity.NongyejishuEntity;
import com.service.NongyejishuService;
import com.entity.vo.NongyejishuVO;
import com.entity.view.NongyejishuView;

@Service("nongyejishuService")
public class NongyejishuServiceImpl extends ServiceImpl<NongyejishuDao, NongyejishuEntity> implements NongyejishuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyejishuEntity> page = this.selectPage(
                new Query<NongyejishuEntity>(params).getPage(),
                new EntityWrapper<NongyejishuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyejishuEntity> wrapper) {
		  Page<NongyejishuView> page =new Query<NongyejishuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyejishuVO> selectListVO(Wrapper<NongyejishuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyejishuVO selectVO(Wrapper<NongyejishuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyejishuView> selectListView(Wrapper<NongyejishuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyejishuView selectView(Wrapper<NongyejishuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
