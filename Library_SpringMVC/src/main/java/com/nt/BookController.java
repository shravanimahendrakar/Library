package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dao.BookDao;
import com.nt.entity.Book;
import com.nt.utility.BookType;

@Controller
public class BookController {

	@Autowired
	private BookDao dao;
	
	@RequestMapping("/book-details")
	public String getBookDetails(@RequestParam() String type, Model model, @RequestParam() String userName) {
		List<Book> list=dao.getBookDetailsByType(type);
		model.addAttribute("bookList", list);
		model.addAttribute("userName", userName);
		model.addAttribute("bookTypes", BookType.BookTypes.values());
		return "bookDetails";
	}
}
