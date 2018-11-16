package vn.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/hello/{id}/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable("id") int id, @MatrixVariable("name") String name, ModelMap modeMap) {
		modeMap.addAttribute("id", id);
		modeMap.addAttribute("name", name);
		return "hello";
	}
}
