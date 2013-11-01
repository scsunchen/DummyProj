/**
 * 
 */
package com.simonsw.base.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simonsw.base.entity.Users;
import com.simonsw.base.service.UserService;
import com.simonsw.common.orm.dao.HibernateDaoSupport;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
@Service
public class UserServiceImpl extends HibernateDaoSupport<Users> implements
		UserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.simonsw.base.service.UserService#isExistUser(com.simonsw.base.entity
	 * .User)
	 */
	@Override
	public boolean isExistUser(Users loginUser) {
		if (loginUser != null) {
			Users user = getUserByName(loginUser.getUsername());
			if (user != null) {
				if (user.getPassword().equals(loginUser.getPassword())) {
					return true;
				}
			}
		}

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.simonsw.base.service.UserService#getUserByName(java.lang.String)
	 */
	@Override
	public Users getUserByName(String username) {
		Users user = null;
		List<Users> users = findDatas("username", username);
		if(users != null && users.size() > 0){
			user = users.get(0);
		}
		return user;
	}

}
