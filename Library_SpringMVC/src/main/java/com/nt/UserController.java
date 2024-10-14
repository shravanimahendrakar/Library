package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dao.UseDao;
import com.nt.entity.User;

@Controller
public class UserController {

	@Autowired
	private UseDao dao;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	
	@RequestMapping("/register-form")
	public String getRegister(Model model) {
		int lastUserId = dao.getLastUserId();
		model.addAttribute("lastUserId", lastUserId);
		return "register";
	}

	@RequestMapping("/register-user")
	public String registerUser(Model model, @ModelAttribute User u) {
		System.out.println(u.getId() + " " + u.getName() + " " + u.getAddress() + " " + u.getEmailId() + " ");
		dao.register(u);
		model.addAttribute("msg", "Registration successful");
		return "index";
	}

	@RequestMapping("/all-user")
	public String getAllUser(Model model) {
		List<User> userList = dao.getAllUser();
		model.addAttribute("userList", userList);
		return "displayAll";
	}
}
