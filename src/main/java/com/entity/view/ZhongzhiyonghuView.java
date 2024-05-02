package com.entity.view;

import com.entity.ZhongzhiyonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 种植用户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("zhongzhiyonghu")
public class ZhongzhiyonghuView  extends ZhongzhiyonghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongzhiyonghuView(){
	}
 
 	public ZhongzhiyonghuView(ZhongzhiyonghuEntity zhongzhiyonghuEntity){
 	try {
			BeanUtils.copyProperties(this, zhongzhiyonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
