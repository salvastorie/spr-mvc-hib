package com.sprhib.controller;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.init.WebAppConfig;

@Controller
public class LinkController {
	
	@Autowired
	private WebAppConfig wac;
	
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		return initialPage();
	}
	
	@RequestMapping(value="/index")
	public ModelAndView indexPage() {
		return initialPage();
	}
	
	private ModelAndView initialPage(){
		String s;
		try {
			DriverManagerDataSource dmds = (DriverManagerDataSource)wac.dataSource();
			s = dmds.getUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			s = e.getMessage();
		}
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", s);
		return mav;
	}
}
