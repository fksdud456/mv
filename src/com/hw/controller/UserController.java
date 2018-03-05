package com.hw.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hw.vo.User;

@Controller
public class UserController {

	@RequestMapping("/userlist.do")
	public String list(Model m) {
		// Database에서 데이터를 가지고 온다.
		ArrayList<Object> list = null;
		list = new ArrayList<>();
		list.add(new User("id01", "pwd01", "일말숙"));
		list.add(new User("id02", "pwd02", "이말숙"));
		list.add(new User("id03", "pwd03", "삼말숙"));
		list.add(new User("id04", "pwd04", "사말숙"));
		list.add(new User("id05", "pwd05", "오말숙"));
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
