package com.simonsw.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simonsw.demo.entity.Demo;
import com.simonsw.hessian.HelloService;

/**
 * @author lv_jiafa@hoperun.com
 * @since 2012-8-9
 */
public class HessianClient {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"hessian-client.xml");

		HelloService hs = (HelloService) ctx.getBean("helloService");
		p(hs.hashCode());

		// Hessian服务的url
		// String url =
		// "http://localhost:8080/DummyProj/services/hello-service";
		// p("url ==> " + url);
		// HessianProxyFactory factory = new HessianProxyFactory();

		// 获得Hessian服务的远程引用
		// HelloService hs = (HelloService) factory
		// .create(HelloService.class, url);

		hs.hello();
		for (Demo demo : hs.getDemos()) {
			p(demo.getCode() + " <> " + demo.getName());
		}
	}

	static void p(Object value) {
		System.out.println(value);
	}

}
