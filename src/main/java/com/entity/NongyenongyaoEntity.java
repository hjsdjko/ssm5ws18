package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 农业农药
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("nongyenongyao")
public class NongyenongyaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongyenongyaoEntity() {
		
	}
	
	public NongyenongyaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 农药名称
	 */
					
	private String nongyaomingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：农药名称
	 */
	public void setNongyaomingcheng(String nongyaomingcheng) {
		this.nongyaomingcheng = nongyaomingcheng;
	}
	/**
	 * 获取：农药名称
	 */
	public String getNongyaomingcheng() {
		return nongyaomingcheng;
	}
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
