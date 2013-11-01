/**
 * 
 */
package com.simonsw.base.service;

import java.util.List;

import com.simonsw.base.entity.Role;
import com.simonsw.base.entity.RoleResource;
import com.simonsw.common.orm.dao.BaseDao;

/**
 * @author Simon Lv
 * @since Oct 31, 2013
 */
public interface RoleResourceService extends BaseDao<RoleResource> {

	public List<RoleResource> getUserRoleByRoleId(Role role);
}
