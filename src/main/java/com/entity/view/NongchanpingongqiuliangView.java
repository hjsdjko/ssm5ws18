package com.entity.view;

import com.entity.NongchanpingongqiuliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农产品供求量
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("nongchanpingongqiuliang")
public class NongchanpingongqiuliangView  extends NongchanpingongqiuliangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongchanpingongqiuliangView(){
	}
 
 	public NongchanpingongqiuliangView(NongchanpingongqiuliangEntity nongchanpingongqiuliangEntity){
 	try {
			BeanUtils.copyProperties(this, nongchanpingongqiuliangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
