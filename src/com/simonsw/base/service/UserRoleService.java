/**
 * 
 */
package com.simonsw.base.service;

import java.util.List;

import com.simonsw.base.entity.UserRole;
import com.simonsw.base.entity.Users;
import com.simonsw.common.orm.dao.BaseDao;

/**
 * @author Simon Lv
 * @since Oct 31, 2013
 */
public interface UserRoleService extends BaseDao<UserRole> {

	public List<UserRole> getUserRoleByUserId(Users user);
}
