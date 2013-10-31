/**
 * 
 */
package com.simonsw.base.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simonsw.base.entity.RoleResource;
import com.simonsw.base.service.RoleResourceService;
import com.simonsw.common.orm.dao.HibernateDaoSupport;

/**
 * @author Simon Lv
 * @since Oct 31, 2013
 */
@Service
public class RoleResourceServiceImpl extends HibernateDaoSupport<RoleResource> implements
		RoleResourceService {

	/* (non-Javadoc)
	 * @see com.simonsw.base.service.RoleResourceService#getUserRoleByRoleId(long)
	 */
	@Override
	public List<RoleResource> getUserRoleByRoleId(long roleId) {
		return findDatas("role_id", roleId);
	}

}
