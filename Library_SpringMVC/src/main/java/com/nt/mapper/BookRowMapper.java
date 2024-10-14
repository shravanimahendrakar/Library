package com.nt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.Book;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id=rs.getInt("id");
		String name=rs.getString("name");
		String type=rs.getString("type");
		return new Book(id, name, type);
	}

}
