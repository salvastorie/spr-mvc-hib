package com.sprhib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {
	
//	@Autowired
//	private WebAppConfig wac;
	
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		return initialPage();
	}
	
	@RequestMapping(value="/index")
	public ModelAndView indexPage() {
		return initialPage();
	}
	
	private ModelAndView initialPage(){
//		String s = "";
//		
//		
//		try {
//			DriverManagerDataSource dmds = (DriverManagerDataSource)wac.dataSource();
//			s += "\t" + dmds.getUrl();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			s += "\t" + e.getMessage();
//		}
		
//		s += wac.getEnv().toString();
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "un messaggio");
		return mav;
	}
}
