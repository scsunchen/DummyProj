/**
 * 
 */
package com.simonsw.base.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simonsw.base.entity.UserRole;
import com.simonsw.base.service.UserRoleService;
import com.simonsw.common.orm.dao.HibernateDaoSupport;

/**
 * @author Simon Lv
 * @since Oct 31, 2013
 */
@Service
public class UserRoleServiceImpl extends HibernateDaoSupport<UserRole> implements
		UserRoleService {

	/* (non-Javadoc)
	 * @see com.simonsw.base.service.UserRoleService#getUserRoleByUserId(long)
	 */
	@Override
	public List<UserRole> getUserRoleByUserId(long userId) {
		return findDatas("user_id", userId);
	}

}
