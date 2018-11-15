package vn.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		String users ="User_ModelAndView";
		int age = 18;
		modelAndView.addObject("tendangnhap", users);
		modelAndView.addObject("ages", age);
		return modelAndView;
	}
	
	@RequestMapping("/home")
	public String home(ModelMap modeMap) {
		String users ="User_Method_String";
		modeMap.addAttribute("tendangnhap", users);
		int age = 18;
		modeMap.addAttribute("ages", age);
		return "index";
	}
}
