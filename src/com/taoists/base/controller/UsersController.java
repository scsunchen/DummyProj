/**
 * 
 */
package com.taoists.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taoists.base.controller.path.ResultPath;
import com.taoists.common.ViewName;
import com.taoists.common.controller.CommonController;
import com.taoists.common.controller.Module;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
@Controller
@RequestMapping(ResultPath.user)
public class UsersController extends CommonController {

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		return forward(ViewName.insert);
	}
	
	/* (non-Javadoc)
	 * @see com.taoists.common.controller.CommonController#getModule()
	 */
	@Override
	protected String getModule() {
		return Module.example.getName();
	}

}
