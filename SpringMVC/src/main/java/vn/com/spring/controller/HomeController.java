package vn.com.spring.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.com.spring.entity.NhanVien;

@Controller
public class HomeController {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	@RequestMapping(value = { "/", "/index" })
	public String index(ModelMap modelMap) {
	/*	
		 * String insertNV =
		 * "INSERT INTO NHANVIEN(DIACHI,HOTEN,MATKHAU) values('Cardinal', 'Tom B. Erichsen', 'Skagen 21')"
		 * ;
		 
		String query = "FROM NhanVien";
		Session session = sessionFactory.getCurrentSession();
		
		 * for (int i = 0; i < 2; i++) {
		 * session.createNativeQuery(insertNV).executeUpdate(); }
		 
		List<NhanVien> list = (List<NhanVien>)session.createQuery(query).list();
		modelMap.addAttribute("lists", list);*/

		return "login";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@ModelAttribute NhanVien nhanVien, ModelMap modeMap) {
		modeMap.addAttribute("nhanVien", nhanVien);
		return "login";
	}
}
