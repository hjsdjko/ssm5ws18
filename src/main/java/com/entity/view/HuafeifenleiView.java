package com.entity.view;

import com.entity.HuafeifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 化肥分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("huafeifenlei")
public class HuafeifenleiView  extends HuafeifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuafeifenleiView(){
	}
 
 	public HuafeifenleiView(HuafeifenleiEntity huafeifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, huafeifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
