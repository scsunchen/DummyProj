package com.taoists.hessian.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.taoists.demo.entity.Demo;
import com.taoists.hessian.HelloService;

/**
 * @author lv_jiafa@hoperun.com
 * @since 2012-8-9
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

	public String hello() {
		return "This is the hello";
	}

	@Override
	public List<Demo> getDemos() {
		Demo demo = new Demo();
		demo.setCode("10000");
		demo.setName("This is test");
		return Lists.newArrayList(demo);
	}

}
