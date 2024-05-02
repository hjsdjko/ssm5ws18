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


import com.dao.DiscusszaishounongchanpinDao;
import com.entity.DiscusszaishounongchanpinEntity;
import com.service.DiscusszaishounongchanpinService;
import com.entity.vo.DiscusszaishounongchanpinVO;
import com.entity.view.DiscusszaishounongchanpinView;

@Service("discusszaishounongchanpinService")
public class DiscusszaishounongchanpinServiceImpl extends ServiceImpl<DiscusszaishounongchanpinDao, DiscusszaishounongchanpinEntity> implements DiscusszaishounongchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszaishounongchanpinEntity> page = this.selectPage(
                new Query<DiscusszaishounongchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscusszaishounongchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszaishounongchanpinEntity> wrapper) {
		  Page<DiscusszaishounongchanpinView> page =new Query<DiscusszaishounongchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszaishounongchanpinVO> selectListVO(Wrapper<DiscusszaishounongchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszaishounongchanpinVO selectVO(Wrapper<DiscusszaishounongchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszaishounongchanpinView> selectListView(Wrapper<DiscusszaishounongchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszaishounongchanpinView selectView(Wrapper<DiscusszaishounongchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
