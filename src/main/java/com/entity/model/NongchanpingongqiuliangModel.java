package com.entity.model;

import com.entity.NongchanpingongqiuliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 农产品供求量
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-25 08:55:59
 */
public class NongchanpingongqiuliangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品分类
	 */
	
	private String chanpinfenlei;
		
	/**
	 * 产品图片
	 */
	
	private String chanpintupian;
		
	/**
	 * 时间
	 */
	
	private String shijian;
		
	/**
	 * 供求量
	 */
	
	private String gongqiuliang;
		
	/**
	 * 需求量
	 */
	
	private String xuqiuliang;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：产品分类
	 */
	 
	public void setChanpinfenlei(String chanpinfenlei) {
		this.chanpinfenlei = chanpinfenlei;
	}
	
	/**
	 * 获取：产品分类
	 */
	public String getChanpinfenlei() {
		return chanpinfenlei;
	}
				
	
	/**
	 * 设置：产品图片
	 */
	 
	public void setChanpintupian(String chanpintupian) {
		this.chanpintupian = chanpintupian;
	}
	
	/**
	 * 获取：产品图片
	 */
	public String getChanpintupian() {
		return chanpintupian;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public String getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：供求量
	 */
	 
	public void setGongqiuliang(String gongqiuliang) {
		this.gongqiuliang = gongqiuliang;
	}
	
	/**
	 * 获取：供求量
	 */
	public String getGongqiuliang() {
		return gongqiuliang;
	}
				
	
	/**
	 * 设置：需求量
	 */
	 
	public void setXuqiuliang(String xuqiuliang) {
		this.xuqiuliang = xuqiuliang;
	}
	
	/**
	 * 获取：需求量
	 */
	public String getXuqiuliang() {
		return xuqiuliang;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
