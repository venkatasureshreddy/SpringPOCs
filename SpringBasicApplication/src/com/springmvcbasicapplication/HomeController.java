package com.springmvcbasicapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//This is COntroller Class
@Controller
public class HomeController {

	// Adding REQUEST MAPPING ---> When dispatcher directly calls this method by mention url pattern as /
	
	@RequestMapping("/")
	public String showPage(){
		
		return "main-menu";
	}
}
