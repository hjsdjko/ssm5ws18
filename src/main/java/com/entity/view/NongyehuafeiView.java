package com.entity.view;

import com.entity.NongyehuafeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农业化肥
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("nongyehuafei")
public class NongyehuafeiView  extends NongyehuafeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongyehuafeiView(){
	}
 
 	public NongyehuafeiView(NongyehuafeiEntity nongyehuafeiEntity){
 	try {
			BeanUtils.copyProperties(this, nongyehuafeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
