package com.ndc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ndc.app.util.PropertiesUtil;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	
	@RequestMapping
	public String adminIndex(Model model) {
		return "adminIndex";
	}
	
	@ModelAttribute("title")
	public String getTitle() {
		return PropertiesUtil.getProperty("app.title");
	}

}
