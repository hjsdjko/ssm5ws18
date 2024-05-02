package com.entity.model;

import com.entity.NongyejishuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 农业技术
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public class NongyejishuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
