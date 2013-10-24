package com.taoists.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taoists.common.orm.entity.BaseEntity;

/**
 * @author lv_jiafa@hoperun.com
 * @since 2012-8-9
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "taoists_demo")
public class Demo extends BaseEntity {

	private String employeeNo;
	private String name;
	private String sex;
	private Boolean status;
	private Boolean type;	
	private String ext;
	private String code;


	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getType() {
		return type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
