package com.simonsw.hessian;

import java.util.List;

import com.simonsw.demo.entity.Demo;

/**
 * @author lv_jiafa@hoperun.com
 * @since 2012-8-9
 */
public interface HelloService {

	String hello();
	
	List<Demo> getDemos();

}
