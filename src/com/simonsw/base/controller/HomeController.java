/**
 * 
 */
package com.simonsw.base.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simonsw.common.controller.CommonController;
import com.simonsw.common.controller.Module;
import com.simonsw.common.controller.path.ResultPath;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
@Controller
@RequestMapping()
public class HomeController extends CommonController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return ResultPath.GOTO_HOME;
	}
	
	@RequestMapping(value=ResultPath.login, method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("errorMessages", "");
		return ResultPath.GOTO_LOGIN;
	}
	
	@RequestMapping(value=ResultPath._403, method = RequestMethod.GET)
	public String limitFor403(Model model) {
		return ResultPath.GOTO_403;
	}
	
	@RequestMapping(value=ResultPath.logout, method = RequestMethod.GET)
	public String logout(Model model) {
		return ResultPath.GOTO_INDEX;
	}

	/* (non-Javadoc)
	 * @see com.simonsw.common.controller.CommonController#getModule()
	 */
	@Override
	protected String getModule() {
		return Module.example.getName();
	}

}
