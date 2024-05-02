package com.entity.vo;

import com.entity.NongyezhongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 农业种子
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public class NongyezhongziVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 种子分类
	 */
	
	private String zhongzifenlei;
		
	/**
	 * 种子产地
	 */
	
	private String zhongzichandi;
		
	/**
	 * 种子介绍
	 */
	
	private String zhongzijieshao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：种子分类
	 */
	 
	public void setZhongzifenlei(String zhongzifenlei) {
		this.zhongzifenlei = zhongzifenlei;
	}
	
	/**
	 * 获取：种子分类
	 */
	public String getZhongzifenlei() {
		return zhongzifenlei;
	}
				
	
	/**
	 * 设置：种子产地
	 */
	 
	public void setZhongzichandi(String zhongzichandi) {
		this.zhongzichandi = zhongzichandi;
	}
	
	/**
	 * 获取：种子产地
	 */
	public String getZhongzichandi() {
		return zhongzichandi;
	}
				
	
	/**
	 * 设置：种子介绍
	 */
	 
	public void setZhongzijieshao(String zhongzijieshao) {
		this.zhongzijieshao = zhongzijieshao;
	}
	
	/**
	 * 获取：种子介绍
	 */
	public String getZhongzijieshao() {
		return zhongzijieshao;
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
