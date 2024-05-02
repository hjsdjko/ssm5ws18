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
 * 农业种子
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("nongyezhongzi")
public class NongyezhongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongyezhongziEntity() {
		
	}
	
	public NongyezhongziEntity(T t) {
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
	 * 种子名称
	 */
					
	private String zhongzimingcheng;
	
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
	 * 设置：种子名称
	 */
	public void setZhongzimingcheng(String zhongzimingcheng) {
		this.zhongzimingcheng = zhongzimingcheng;
	}
	/**
	 * 获取：种子名称
	 */
	public String getZhongzimingcheng() {
		return zhongzimingcheng;
	}
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
