/**
 * 
 */
package com.simonsw.base.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.simonsw.common.orm.entity.BaseEntity;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "taoists_user")
public class User extends BaseEntity {
	private String username;
	private String password;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
