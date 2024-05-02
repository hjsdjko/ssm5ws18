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


import com.dao.ZhongzhiyonghuDao;
import com.entity.ZhongzhiyonghuEntity;
import com.service.ZhongzhiyonghuService;
import com.entity.vo.ZhongzhiyonghuVO;
import com.entity.view.ZhongzhiyonghuView;

@Service("zhongzhiyonghuService")
public class ZhongzhiyonghuServiceImpl extends ServiceImpl<ZhongzhiyonghuDao, ZhongzhiyonghuEntity> implements ZhongzhiyonghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzhiyonghuEntity> page = this.selectPage(
                new Query<ZhongzhiyonghuEntity>(params).getPage(),
                new EntityWrapper<ZhongzhiyonghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzhiyonghuEntity> wrapper) {
		  Page<ZhongzhiyonghuView> page =new Query<ZhongzhiyonghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongzhiyonghuVO> selectListVO(Wrapper<ZhongzhiyonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzhiyonghuVO selectVO(Wrapper<ZhongzhiyonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzhiyonghuView> selectListView(Wrapper<ZhongzhiyonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzhiyonghuView selectView(Wrapper<ZhongzhiyonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
