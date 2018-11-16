package vn.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.com.spring.entity.NhanVien;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@ModelAttribute NhanVien nhanVien, ModelMap modeMap) {
		modeMap.addAttribute("nhanVien", nhanVien);
		return "hello";
	}
}
