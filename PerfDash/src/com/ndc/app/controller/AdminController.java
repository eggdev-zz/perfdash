package com.ndc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ndc.app.util.PropertiesUtil;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	
	@RequestMapping
	public String adminIndex(Model model) {
		return "adminIndex";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String processUpload(@RequestParam(required=true,value="file") MultipartFile file, Model model, RedirectAttributes attr) {
		
		if(file.isEmpty()) {
			model.addAttribute("error", PropertiesUtil.getProperty("file.empty"));
			return "adminIndex";
		}
		
		if(file.getContentType().equals("application/pdf") || file.getContentType().equals("application/vnd.ms-excel")) {
			attr.addFlashAttribute("success", PropertiesUtil.getProperty("file.success"));	
			return "redirect:/admin";
		} else {
			model.addAttribute("error", PropertiesUtil.getProperty("file.invalid"));
			return "adminIndex";
		}
	
	}
	
	@ModelAttribute("title")
	public String getTitle() {
		return PropertiesUtil.getProperty("app.title");
	}

}
