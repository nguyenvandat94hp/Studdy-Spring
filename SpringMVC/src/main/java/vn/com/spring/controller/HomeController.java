package vn.com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.spring.entity.NhanVien;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(ModelMap modeMap) {
		modeMap.addAttribute("listNhanVien", createListNhanVien());
		return "index";
	}
	
	private static List<NhanVien> createListNhanVien(){
		List<NhanVien> listNhanVien = new ArrayList<NhanVien>();
		listNhanVien.add(new NhanVien(0203, "Dat"));
		listNhanVien.add(new NhanVien(2711, "Yen"));	
		return listNhanVien;
	}
}
