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
 * 农业化肥
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("nongyehuafei")
public class NongyehuafeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongyehuafeiEntity() {
		
	}
	
	public NongyehuafeiEntity(T t) {
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
	 * 化肥名称
	 */
					
	private String huafeimingcheng;
	
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
	 * 设置：化肥名称
	 */
	public void setHuafeimingcheng(String huafeimingcheng) {
		this.huafeimingcheng = huafeimingcheng;
	}
	/**
	 * 获取：化肥名称
	 */
	public String getHuafeimingcheng() {
		return huafeimingcheng;
	}
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
