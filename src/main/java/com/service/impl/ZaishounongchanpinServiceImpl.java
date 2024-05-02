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


import com.dao.ZaishounongchanpinDao;
import com.entity.ZaishounongchanpinEntity;
import com.service.ZaishounongchanpinService;
import com.entity.vo.ZaishounongchanpinVO;
import com.entity.view.ZaishounongchanpinView;

@Service("zaishounongchanpinService")
public class ZaishounongchanpinServiceImpl extends ServiceImpl<ZaishounongchanpinDao, ZaishounongchanpinEntity> implements ZaishounongchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaishounongchanpinEntity> page = this.selectPage(
                new Query<ZaishounongchanpinEntity>(params).getPage(),
                new EntityWrapper<ZaishounongchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaishounongchanpinEntity> wrapper) {
		  Page<ZaishounongchanpinView> page =new Query<ZaishounongchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaishounongchanpinVO> selectListVO(Wrapper<ZaishounongchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaishounongchanpinVO selectVO(Wrapper<ZaishounongchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaishounongchanpinView> selectListView(Wrapper<ZaishounongchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaishounongchanpinView selectView(Wrapper<ZaishounongchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
