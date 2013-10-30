/**
 * 
 */
package com.taoists.base.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taoists.common.controller.CommonController;
import com.taoists.common.controller.Module;
import com.taoists.common.controller.path.ResultPath;

/**
 * @author Simon Lv
 * @since Oct 29, 2013
 */
@Controller
@RequestMapping(ResultPath.home)
public class HomeController extends CommonController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	/* (non-Javadoc)
	 * @see com.taoists.common.controller.CommonController#getModule()
	 */
	@Override
	protected String getModule() {
		return Module.example.getName();
	}

}
