package com.hw.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hw.vo.Item;

@Controller
public class ItemController {

	@RequestMapping("/itemlist.do")
	public String list(Model m) {
		// Database���� �����͸� ������ �´�.
		ArrayList<Object> list = null;
		list = new ArrayList<>();
		list.add(new Item(0, "pwd01", 0));
		list.add(new Item(1, "pwd02", 1005));
		list.add(new Item(2, "pwd03", 230));
		list.add(new Item(3, "pwd04", 3025));
		list.add(new Item(4, "pwd05", 4050));
		m.addAttribute("itemlist", list);
		m.addAttribute("center", "item/list");
		return "main";
	}

	@RequestMapping("/itemadd.do")
	public String add(Model m) {
		m.addAttribute("center", "item/add");
		return "main";
	}
	
	@RequestMapping("/itemaddimpl.do")
	public String addimpl(Model m, Item user) {
		/* DB�� insert �ϴ� �κ� �߰� */
		m.addAttribute("center", "item/addok");
		return "main";
	}
	
}
