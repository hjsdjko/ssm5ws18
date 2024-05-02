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


import com.dao.ZhongzifenleiDao;
import com.entity.ZhongzifenleiEntity;
import com.service.ZhongzifenleiService;
import com.entity.vo.ZhongzifenleiVO;
import com.entity.view.ZhongzifenleiView;

@Service("zhongzifenleiService")
public class ZhongzifenleiServiceImpl extends ServiceImpl<ZhongzifenleiDao, ZhongzifenleiEntity> implements ZhongzifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzifenleiEntity> page = this.selectPage(
                new Query<ZhongzifenleiEntity>(params).getPage(),
                new EntityWrapper<ZhongzifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzifenleiEntity> wrapper) {
		  Page<ZhongzifenleiView> page =new Query<ZhongzifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongzifenleiVO> selectListVO(Wrapper<ZhongzifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzifenleiVO selectVO(Wrapper<ZhongzifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzifenleiView> selectListView(Wrapper<ZhongzifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzifenleiView selectView(Wrapper<ZhongzifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
