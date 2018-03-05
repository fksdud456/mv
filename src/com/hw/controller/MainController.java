package com.hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
		
	@RequestMapping("/main.do")
	public String main() {
		return "main";
	}
/*	@RequestMapping("/user.do")
	public String user(Model model) {
		model.addAttribute("center", "user");
		return "main";
	}
	@RequestMapping("/product.do")
	public String product(Model model) {
		model.addAttribute("center", "product");
		return "main";
	}
	@RequestMapping("/item.hw")
	public String item(Model model) {
		model.addAttribute("center", "item");
		return "main";
	}
	@RequestMapping("/customer.hw")
	public String customer(Model model) {
		model.addAttribute("center", "customer");
		return "main";
	}*/
}



