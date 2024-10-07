package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dao.UseDao;
import com.nt.entity.User;
import com.nt.utility.BookType;

@Controller
public class UserController {

	@Autowired
	private UseDao dao;

	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/logout")
	public String logout() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(Model model, @RequestParam() String emailId, @RequestParam() String password) {

		User u = dao.checkUserExist(emailId);
		if (u != null && password.equals(u.getPassword())) {
			model.addAttribute("bookTypes", BookType.BookTypes.values());
			model.addAttribute("userName", u.getName());
			return "bookDetails";
		} else {
			model.addAttribute("errorMsg", "Login failed");
			return "index";
		}
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
		return "result";
	}

	@RequestMapping("/all-user")
	public String getAllUser(Model model) {
		List<User> userList = dao.getAllUser();
		model.addAttribute("userList", userList);
		return "displayAll";
	}
}
