package com.taoists.demo.service.impl;

import org.springframework.stereotype.Service;

import com.taoists.common.orm.dao.HibernateDaoSupport;
import com.taoists.demo.entity.Demo;
import com.taoists.demo.service.DemoService;

/**
 * @author lv_jiafa@hoperun.com
 * @since 2012-8-9
 */
@Service
public class DemoServiceImpl extends HibernateDaoSupport<Demo> implements DemoService {


}
