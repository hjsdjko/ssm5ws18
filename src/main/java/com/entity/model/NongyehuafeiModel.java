package com.entity.model;

import com.entity.NongyehuafeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 农业化肥
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public class NongyehuafeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 化肥分类
	 */
	
	private String huafeifenlei;
		
	/**
	 * 化肥产地
	 */
	
	private String huafeichandi;
		
	/**
	 * 化肥介绍
	 */
	
	private String huafeijieshao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：化肥分类
	 */
	 
	public void setHuafeifenlei(String huafeifenlei) {
		this.huafeifenlei = huafeifenlei;
	}
	
	/**
	 * 获取：化肥分类
	 */
	public String getHuafeifenlei() {
		return huafeifenlei;
	}
				
	
	/**
	 * 设置：化肥产地
	 */
	 
	public void setHuafeichandi(String huafeichandi) {
		this.huafeichandi = huafeichandi;
	}
	
	/**
	 * 获取：化肥产地
	 */
	public String getHuafeichandi() {
		return huafeichandi;
	}
				
	
	/**
	 * 设置：化肥介绍
	 */
	 
	public void setHuafeijieshao(String huafeijieshao) {
		this.huafeijieshao = huafeijieshao;
	}
	
	/**
	 * 获取：化肥介绍
	 */
	public String getHuafeijieshao() {
		return huafeijieshao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
