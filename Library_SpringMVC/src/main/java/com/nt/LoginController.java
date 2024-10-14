package com.nt;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dao.UseDao;
import com.nt.entity.User;
import com.nt.utility.BookType;

@Controller
public class LoginController {

	@Autowired
	private UseDao dao;

	@RequestMapping("/login")
	public String login(Model model, @RequestParam() String emailId, @RequestParam() String password,
			HttpSession session) {

		User u = dao.checkUserExist(emailId);
		if (u != null && password.equals(u.getPassword())) {
			model.addAttribute("admin", u.getName().equals("admin"));
			model.addAttribute("bookTypes", BookType.BookTypes.values());
			model.addAttribute("userName", u.getName());
			session.setAttribute("userId", u.getId());
			return "bookDetails";
		} else {
			model.addAttribute("errorMsg", "Login failed");
			return "index";
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		model.addAttribute("msg", "Logout successful");
		return "index";
	}

}
