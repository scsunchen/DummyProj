/**
 * 
 */
package com.simonsw.base.service.impl;

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

}
