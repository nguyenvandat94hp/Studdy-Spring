package vn.com.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.spring.entity.NhanVien;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config-spring.xml");
		NhanVien nhanVien = (NhanVien) context.getBean("nhanVien");
		String display = nhanVien.getInfomationEmployee() + context.toString() + nhanVien.getList().toString() + "\n"
				+ nhanVien.getGiamDocs().toString() + nhanVien.getMap().toString();
		System.out.println(display);
		return display;
	}
}
