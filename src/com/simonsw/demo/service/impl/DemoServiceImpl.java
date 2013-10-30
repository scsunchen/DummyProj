package com.simonsw.demo.service.impl;

import org.springframework.stereotype.Service;

import com.simonsw.common.orm.dao.HibernateDaoSupport;
import com.simonsw.demo.entity.Demo;
import com.simonsw.demo.service.DemoService;

/**
 * @author lv_jiafa@hoperun.com
 * @since 2012-8-9
 */
@Service
public class DemoServiceImpl extends HibernateDaoSupport<Demo> implements DemoService {


}
