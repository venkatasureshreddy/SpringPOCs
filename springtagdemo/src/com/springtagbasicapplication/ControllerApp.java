package com.springtagbasicapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ControllerApp {
	@RequestMapping("/")
	public String showForm(Model model){
		model.addAttribute("student",new Student());
		
	return "showform";
	}
	
	@RequestMapping("/displayform")
	public String displayform(@ModelAttribute("student") Student thestudent){
		
		System.out.println(thestudent.getFirstname()+""+thestudent.getLastname());
		
		return "resultform";
		
	}
}
