package com.hw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hw.frame.Biz;
import com.hw.vo.User;

@Controller
public class UserController {
	@Resource(name="userBiz")
	Biz<User, String> biz;
	
	@RequestMapping("/userlist.do")
	public String list(Model m) {
		System.out.println("userlist");
		// Database에서 데이터를 가지고 온다.
		List<User> list = null;
		list = biz.get();
		m.addAttribute("userlist", list);
		m.addAttribute("center", "user/list");
		return "main";
	}

	@RequestMapping("/useradd.do")
	public String add(Model m) {
		m.addAttribute("center", "user/add");
		return "main";
	}
	
	@RequestMapping("/useraddimpl.do")
	public String addimpl(Model m, User user) {
		/* DB에 insert 하는 부분 추가 */
		m.addAttribute("center", "user/addok");
		return "main";
	}
	
}
