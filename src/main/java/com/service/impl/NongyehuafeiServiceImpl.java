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


import com.dao.NongyehuafeiDao;
import com.entity.NongyehuafeiEntity;
import com.service.NongyehuafeiService;
import com.entity.vo.NongyehuafeiVO;
import com.entity.view.NongyehuafeiView;

@Service("nongyehuafeiService")
public class NongyehuafeiServiceImpl extends ServiceImpl<NongyehuafeiDao, NongyehuafeiEntity> implements NongyehuafeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyehuafeiEntity> page = this.selectPage(
                new Query<NongyehuafeiEntity>(params).getPage(),
                new EntityWrapper<NongyehuafeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyehuafeiEntity> wrapper) {
		  Page<NongyehuafeiView> page =new Query<NongyehuafeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyehuafeiVO> selectListVO(Wrapper<NongyehuafeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyehuafeiVO selectVO(Wrapper<NongyehuafeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyehuafeiView> selectListView(Wrapper<NongyehuafeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyehuafeiView selectView(Wrapper<NongyehuafeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
