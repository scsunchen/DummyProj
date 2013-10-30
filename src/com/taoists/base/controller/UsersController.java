/**
 * 
 */
package com.taoists.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taoists.base.entity.User;
import com.taoists.common.ViewName;
import com.taoists.common.controller.CommonController;
import com.taoists.common.controller.Module;
import com.taoists.common.controller.path.ResultPath;

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
	
	@RequestMapping(method = RequestMethod.POST)
	public String createUser(User user){
		logger.debug("create: user[{}]", user);
		userService.save(user);
		return redirect(ResultPath.demo);
	}
	
	/* (non-Javadoc)
	 * @see com.taoists.common.controller.CommonController#getModule()
	 */
	@Override
	protected String getModule() {
		return Module.example.getName();
	}

}
