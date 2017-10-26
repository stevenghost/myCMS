package cn.aresoft.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: test
 * @author onlineGenerator
 * @date 2017-09-07 15:22:30
 * @version V1.0   
 *
 */
@Entity
@Table(name = "tb_test_user", schema = "")
@SuppressWarnings("serial")
public class TbTestUserEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**name*/
	@Excel(name="name")
	private java.lang.String uName;
	/**pwd*/
	@Excel(name="pwd")
	private java.lang.String uPwd;
	/**创建日期*/
	@Excel(name="创建日期")
	private java.lang.String createTime;
	/**更新日期*/
	@Excel(name="更新日期")
	private java.lang.String updateTime;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  name
	 */
	@Column(name ="U_NAME",nullable=true,length=30)
	public java.lang.String getUName(){
		return this.uName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  name
	 */
	public void setUName(java.lang.String uName){
		this.uName = uName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  pwd
	 */
	@Column(name ="U_PWD",nullable=true,length=30)
	public java.lang.String getUPwd(){
		return this.uPwd;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  pwd
	 */
	public void setUPwd(java.lang.String uPwd){
		this.uPwd = uPwd;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建日期
	 */
	@Column(name ="CREATE_TIME",nullable=true,length=32)
	public java.lang.String getCreateTime(){
		return this.createTime;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建日期
	 */
	public void setCreateTime(java.lang.String createTime){
		this.createTime = createTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新日期
	 */
	@Column(name ="UPDATE_TIME",nullable=true,length=32)
	public java.lang.String getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新日期
	 */
	public void setUpdateTime(java.lang.String updateTime){
		this.updateTime = updateTime;
	}
}
