/**
 * 
 */
package com.taoists.base.service.impl;

import org.springframework.stereotype.Service;

import com.taoists.base.entity.User;
import com.taoists.base.service.UserService;
import com.taoists.common.orm.dao.HibernateDaoSupport;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
@Service
public class UserServiceImpl extends HibernateDaoSupport<User> implements
		UserService {

}
