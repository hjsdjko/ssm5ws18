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


import com.dao.QiyeyonghuDao;
import com.entity.QiyeyonghuEntity;
import com.service.QiyeyonghuService;
import com.entity.vo.QiyeyonghuVO;
import com.entity.view.QiyeyonghuView;

@Service("qiyeyonghuService")
public class QiyeyonghuServiceImpl extends ServiceImpl<QiyeyonghuDao, QiyeyonghuEntity> implements QiyeyonghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyeyonghuEntity> page = this.selectPage(
                new Query<QiyeyonghuEntity>(params).getPage(),
                new EntityWrapper<QiyeyonghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyeyonghuEntity> wrapper) {
		  Page<QiyeyonghuView> page =new Query<QiyeyonghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyeyonghuVO> selectListVO(Wrapper<QiyeyonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyeyonghuVO selectVO(Wrapper<QiyeyonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyeyonghuView> selectListView(Wrapper<QiyeyonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyeyonghuView selectView(Wrapper<QiyeyonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
