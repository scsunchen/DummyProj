/**
 * 
 */
package com.simonsw.base.service;

import com.simonsw.base.entity.Users;
import com.simonsw.common.orm.dao.BaseDao;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
public interface UserService extends BaseDao<Users> {
	public boolean isExistUser(Users loginUser);
	public Users getUserByName(String username);
}
