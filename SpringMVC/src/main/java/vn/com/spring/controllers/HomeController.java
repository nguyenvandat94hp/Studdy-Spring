package vn.com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.com.spring.entity.NhanVien;
import vn.com.spring.services.NhanVienService;

@Controller
@Transactional
public class HomeController {

	@Autowired
	NhanVienService nhanVienService;

	@RequestMapping(value = { "/" })
	public String home(ModelMap modelMap) {

		return "login";
	}

	@RequestMapping(value = { "/login" })
	public String loadLoginPage() {
		return "login";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String login(@ModelAttribute NhanVien nhanVien, ModelMap modelMap) {
		if(nhanVienService.findNhanVien(nhanVien.getTenDangNhap(), nhanVien.getMatKhau())) {
			return "home";
		}
		return "login";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@ModelAttribute NhanVien nhanVien, ModelMap modeMap) {
		modeMap.addAttribute("nhanVien", nhanVien);
		return "login";
	}
}
