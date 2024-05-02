package com.entity.view;

import com.entity.NongyejishuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农业技术
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("nongyejishu")
public class NongyejishuView  extends NongyejishuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongyejishuView(){
	}
 
 	public NongyejishuView(NongyejishuEntity nongyejishuEntity){
 	try {
			BeanUtils.copyProperties(this, nongyejishuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
