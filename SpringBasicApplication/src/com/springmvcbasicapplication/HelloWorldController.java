package com.springmvcbasicapplication;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class HelloWorldController {
	@RequestMapping("/show")
	public String showForm(){
		return "show-form";
	}
	
	
	/*
	 *  Using HttpServletrequest and get parameter binding form data to Model
	@RequestMapping("/display-page")
	public String displayPage(HttpServletRequest request,Model model){
		String name = request.getParameter("studentName").toUpperCase();
		
		model.addAttribute("callMe",name);
		
		return "display-page";
	}
	
	*/
	
	// Here using Requestparam as alternative to find formdata to Model.
	@RequestMapping("/display-page")
	public String displayPage(@RequestParam("studentName") String name,Model model){
		String n = name.toUpperCase();
		
		model.addAttribute("callMe",n);
		
		return "display-page";
	}


}
