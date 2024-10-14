package com.nt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id=rs.getInt("id");
		String name=rs.getString("name");
		String address=rs.getString("address");
		String emailId=rs.getString("emailId");
		Long phoneNumber=rs.getLong("phoneNumber");
		String password=rs.getString("password");
		String country=rs.getString("country");
		return new User(id, name, address, emailId, phoneNumber, password, country);
	}

}
