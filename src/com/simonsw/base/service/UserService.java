/**
 * 
 */
package com.simonsw.base.service;

import java.util.List;

import com.simonsw.base.entity.User;
import com.simonsw.common.orm.dao.BaseDao;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
public interface UserService extends BaseDao<User> {
	public boolean isExistUser(User loginUser);
	public List<User> getUserByName(String username);
}
