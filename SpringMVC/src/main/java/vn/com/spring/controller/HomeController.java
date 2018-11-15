package vn.com.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.spring.entity.NhanVien;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config-spring.xml");
		NhanVien nhanVien = (NhanVien) context.getBean("nhanVien");
		
		
		return nhanVien.getInfomationEmployee();
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		System.out.println();
		return "hello";
	}
	public static void main(String[] args) {
		
	}
}
