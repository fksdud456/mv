package com.hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
		
	@RequestMapping("/userlist.do")
	public String list(Model m) {
		m.addAttribute("center","user/list");
		return "main";
	}
	@RequestMapping("/useradd.do")
	public String add(Model m) {
		m.addAttribute("center","user/add");
		return "main";
	}
}



