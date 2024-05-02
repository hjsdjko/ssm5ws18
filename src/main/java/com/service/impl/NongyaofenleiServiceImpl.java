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


import com.dao.NongyaofenleiDao;
import com.entity.NongyaofenleiEntity;
import com.service.NongyaofenleiService;
import com.entity.vo.NongyaofenleiVO;
import com.entity.view.NongyaofenleiView;

@Service("nongyaofenleiService")
public class NongyaofenleiServiceImpl extends ServiceImpl<NongyaofenleiDao, NongyaofenleiEntity> implements NongyaofenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyaofenleiEntity> page = this.selectPage(
                new Query<NongyaofenleiEntity>(params).getPage(),
                new EntityWrapper<NongyaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyaofenleiEntity> wrapper) {
		  Page<NongyaofenleiView> page =new Query<NongyaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyaofenleiVO> selectListVO(Wrapper<NongyaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyaofenleiVO selectVO(Wrapper<NongyaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyaofenleiView> selectListView(Wrapper<NongyaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyaofenleiView selectView(Wrapper<NongyaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
