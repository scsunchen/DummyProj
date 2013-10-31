/**
 * 
 */
package com.simonsw.base.service.impl;

import org.springframework.stereotype.Service;

import com.simonsw.base.entity.Role;
import com.simonsw.base.service.RoleService;
import com.simonsw.common.orm.dao.HibernateDaoSupport;

/**
 * @author Simon Lv
 * @since Oct 31, 2013
 */
@Service
public class RoleServiceImpl extends HibernateDaoSupport<Role> implements
		RoleService {

}
