package vn.com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value = "/s")
	public String login() {
		System.out.println("Login Controller");
		
		return "home";
	}
}
