/**
 * 
 */
package com.simonsw.base.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simonsw.base.entity.User;
import com.simonsw.base.service.UserService;
import com.simonsw.common.orm.dao.HibernateDaoSupport;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
@Service
public class UserServiceImpl extends HibernateDaoSupport<User> implements
		UserService {

	/* (non-Javadoc)
	 * @see com.simonsw.base.service.UserService#isExistUser(com.simonsw.base.entity.User)
	 */
	@Override
	public boolean isExistUser(User loginUser) {
		if(loginUser != null){
			List<User> users = getUserByName(loginUser.getUsername());
			if(users != null){
				for(User user: users){
					if(user.getPassword().equals(loginUser.getPassword())){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see com.simonsw.base.service.UserService#getUserByName(java.lang.String)
	 */
	@Override
	public List<User> getUserByName(String username) {
		return findDatas("username", username);
	}

}
