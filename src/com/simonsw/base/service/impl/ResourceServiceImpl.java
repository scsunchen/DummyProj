/**
 * 
 */
package com.simonsw.base.service.impl;

import org.springframework.stereotype.Service;

import com.simonsw.base.entity.Resource;
import com.simonsw.base.service.ResourceService;
import com.simonsw.common.orm.dao.HibernateDaoSupport;

/**
 * @author Simon Lv
 * @since Oct 31, 2013
 */
@Service
public class ResourceServiceImpl extends HibernateDaoSupport<Resource> implements
		ResourceService {

}
