/**
 * 
 */
package com.simonsw.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simonsw.base.entity.User;
import com.simonsw.common.ViewName;
import com.simonsw.common.bean.Page;
import com.simonsw.common.controller.CommonController;
import com.simonsw.common.controller.Module;
import com.simonsw.common.controller.path.ResultPath;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
@Controller
@RequestMapping(ResultPath.user)
public class UsersController extends CommonController {

	@RequestMapping
	public String list(Page page, HttpServletRequest request,
			HttpServletResponse response) {
		userService.findPage(page);
		return forward(ViewName.list);
	}
	
	@RequestMapping(value="/register-new", method=RequestMethod.GET)
	public String register(Model model){
		model.addAttribute("errorMessages", "");
		return forward(ViewName.insert);
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String createUser(Model model, User user){
		logger.debug("create: user[{}]", user);
		if(userService.getUserByName(user.getUsername()).size()>0){
			model.addAttribute("errorMessages", "用户名重复");
			return forward(ViewName.insert);
		}
		
		userService.save(user);
		return redirect(ResultPath.user);
	}
	
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public String login(HttpServletRequest request, Model model, User user) {
		// TODO
		String username = user.getUsername();
		String password = user.getPassword();
		logger.debug("login: username[{}]", username);
		logger.debug("login: password[{}]", password);
		
		if(!userService.isExistUser(user)){
			model.addAttribute("errorMessages", "填写有错");
			return "home";
		}
		
		return redirect(ResultPath.user);
	}
	
	/* (non-Javadoc)
	 * @see com.simonsw.common.controller.CommonController#getModule()
	 */
	@Override
	protected String getModule() {
		return Module.example.getName();
	}

}
