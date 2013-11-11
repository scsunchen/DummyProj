package com.simonsw.hessian.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simonsw.demo.entity.Demo;
import com.simonsw.demo.service.DemoService;
import com.simonsw.hessian.HelloService;

/**
 * @author Simon Lv
 * @since 2012-8-9
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
	@Autowired
	protected DemoService demoService;
	
	public String hello() {
		return "This is the hello";
	}

	@Override
	public List<Demo> getDemos() {
		/*Demo demo = new Demo();
		demo.setCode("10000");
		demo.setName("This is test");
		return Lists.newArrayList(demo);*/
		
		return demoService.findAll();
	}

}
