package com.taoists.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taoists.demo.entity.Demo;
import com.taoists.hessian.HelloService;

/**
 * @author lv_jiafa@hoperun.com
 * @since 2012-8-9
 */
public class HessianClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("hessian-client.xml");

		HelloService hs = (HelloService) ctx.getBean("helloService");
		p(hs.hashCode());

		for (Demo demo : hs.getDemos()) {
			p(demo.getCode() + "<>" + demo.getName());
		}
	}

	static void p(Object value) {
		System.out.println(value);
	}

}
