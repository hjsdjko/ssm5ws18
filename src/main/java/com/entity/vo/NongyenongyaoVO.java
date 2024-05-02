package com.entity.vo;

import com.entity.NongyenongyaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 农业农药
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public class NongyenongyaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 农药分类
	 */
	
	private String nongyaofenlei;
		
	/**
	 * 农药产地
	 */
	
	private String nongyaochandi;
		
	/**
	 * 农药介绍
	 */
	
	private String nongyaojieshao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：农药分类
	 */
	 
	public void setNongyaofenlei(String nongyaofenlei) {
		this.nongyaofenlei = nongyaofenlei;
	}
	
	/**
	 * 获取：农药分类
	 */
	public String getNongyaofenlei() {
		return nongyaofenlei;
	}
				
	
	/**
	 * 设置：农药产地
	 */
	 
	public void setNongyaochandi(String nongyaochandi) {
		this.nongyaochandi = nongyaochandi;
	}
	
	/**
	 * 获取：农药产地
	 */
	public String getNongyaochandi() {
		return nongyaochandi;
	}
				
	
	/**
	 * 设置：农药介绍
	 */
	 
	public void setNongyaojieshao(String nongyaojieshao) {
		this.nongyaojieshao = nongyaojieshao;
	}
	
	/**
	 * 获取：农药介绍
	 */
	public String getNongyaojieshao() {
		return nongyaojieshao;
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
