package com.ndc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class ExternalController {

	@RequestMapping
	public String externalIndex(Model model) {
		return "externalIndex";
	}
	
}
