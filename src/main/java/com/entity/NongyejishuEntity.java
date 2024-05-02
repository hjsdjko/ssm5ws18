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
 * 农业技术
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
@TableName("nongyejishu")
public class NongyejishuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongyejishuEntity() {
		
	}
	
	public NongyejishuEntity(T t) {
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
	 * 技术名称
	 */
					
	private String jishumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 技术介绍
	 */
					
	private String jishujieshao;
	
	/**
	 * 应用情况
	 */
					
	private String yingyongqingkuang;
	
	/**
	 * 咨询专家
	 */
					
	private String zixunzhuanjia;
	
	
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
	 * 设置：技术名称
	 */
	public void setJishumingcheng(String jishumingcheng) {
		this.jishumingcheng = jishumingcheng;
	}
	/**
	 * 获取：技术名称
	 */
	public String getJishumingcheng() {
		return jishumingcheng;
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
	/**
	 * 设置：技术介绍
	 */
	public void setJishujieshao(String jishujieshao) {
		this.jishujieshao = jishujieshao;
	}
	/**
	 * 获取：技术介绍
	 */
	public String getJishujieshao() {
		return jishujieshao;
	}
	/**
	 * 设置：应用情况
	 */
	public void setYingyongqingkuang(String yingyongqingkuang) {
		this.yingyongqingkuang = yingyongqingkuang;
	}
	/**
	 * 获取：应用情况
	 */
	public String getYingyongqingkuang() {
		return yingyongqingkuang;
	}
	/**
	 * 设置：咨询专家
	 */
	public void setZixunzhuanjia(String zixunzhuanjia) {
		this.zixunzhuanjia = zixunzhuanjia;
	}
	/**
	 * 获取：咨询专家
	 */
	public String getZixunzhuanjia() {
		return zixunzhuanjia;
	}

}
