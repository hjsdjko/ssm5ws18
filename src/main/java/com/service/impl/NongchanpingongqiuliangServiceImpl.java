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


import com.dao.NongchanpingongqiuliangDao;
import com.entity.NongchanpingongqiuliangEntity;
import com.service.NongchanpingongqiuliangService;
import com.entity.vo.NongchanpingongqiuliangVO;
import com.entity.view.NongchanpingongqiuliangView;

@Service("nongchanpingongqiuliangService")
public class NongchanpingongqiuliangServiceImpl extends ServiceImpl<NongchanpingongqiuliangDao, NongchanpingongqiuliangEntity> implements NongchanpingongqiuliangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchanpingongqiuliangEntity> page = this.selectPage(
                new Query<NongchanpingongqiuliangEntity>(params).getPage(),
                new EntityWrapper<NongchanpingongqiuliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchanpingongqiuliangEntity> wrapper) {
		  Page<NongchanpingongqiuliangView> page =new Query<NongchanpingongqiuliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongchanpingongqiuliangVO> selectListVO(Wrapper<NongchanpingongqiuliangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchanpingongqiuliangVO selectVO(Wrapper<NongchanpingongqiuliangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchanpingongqiuliangView> selectListView(Wrapper<NongchanpingongqiuliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchanpingongqiuliangView selectView(Wrapper<NongchanpingongqiuliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
