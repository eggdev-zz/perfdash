package com.ndc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.googlecode.charts4j.Color;
import com.googlecode.charts4j.GCharts;
import com.googlecode.charts4j.PieChart;
import com.googlecode.charts4j.Slice;

@Controller
@RequestMapping(value="/charts")
public class ChartsController {

	@RequestMapping
	public String home(Model model) {
		
		Slice s1 = Slice.newSlice(30, Color.newColor("CACACA"), "Safari", "Apple");
        Slice s2 = Slice.newSlice(30, Color.newColor("DF7417"), "Firefox", "Mozilla");
        Slice s3 = Slice.newSlice(30, Color.newColor("951800"), "Chrome", "Google");
        Slice s4 = Slice.newSlice(10, Color.newColor("01A1DB"), "Internet Explorer", "Microsoft");

        PieChart chart = GCharts.newPieChart(s1, s2, s3, s4);
        chart.setSize(500, 200);
        chart.setThreeD(true);
        String url = chart.toURLString();
        
        model.addAttribute("url", url);

		return "home";
		
	}
	
}
