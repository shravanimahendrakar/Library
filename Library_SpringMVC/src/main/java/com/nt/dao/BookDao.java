package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nt.entity.Book;
import com.nt.mapper.BookRowMapper;

@Component
public class BookDao {

	@Autowired
	private JdbcTemplate template;
	
	public List<Book> getBookDetailsByType(String type) {
		Object[] args= {type};
		try {
			List<Book> list=template.query("select * from book where type=?", new BookRowMapper(),args);
			return list;
		}catch(Exception e) {
			System.out.println("No books found ");
			e.printStackTrace();
			return null;
		}
	}
}
