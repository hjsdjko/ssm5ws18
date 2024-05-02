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


import com.dao.NongchanpinjiageDao;
import com.entity.NongchanpinjiageEntity;
import com.service.NongchanpinjiageService;
import com.entity.vo.NongchanpinjiageVO;
import com.entity.view.NongchanpinjiageView;

@Service("nongchanpinjiageService")
public class NongchanpinjiageServiceImpl extends ServiceImpl<NongchanpinjiageDao, NongchanpinjiageEntity> implements NongchanpinjiageService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchanpinjiageEntity> page = this.selectPage(
                new Query<NongchanpinjiageEntity>(params).getPage(),
                new EntityWrapper<NongchanpinjiageEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchanpinjiageEntity> wrapper) {
		  Page<NongchanpinjiageView> page =new Query<NongchanpinjiageView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongchanpinjiageVO> selectListVO(Wrapper<NongchanpinjiageEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchanpinjiageVO selectVO(Wrapper<NongchanpinjiageEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchanpinjiageView> selectListView(Wrapper<NongchanpinjiageEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchanpinjiageView selectView(Wrapper<NongchanpinjiageEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
