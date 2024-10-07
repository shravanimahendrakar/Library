package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import com.nt.entity.User;
import com.nt.mapper.UserRowMapper;

@Component
public class UseDao {

	@Autowired
	private JdbcTemplate template;

	public int getLastUserId() {
		try {
			Integer lastUserId = template.queryForObject("select id from user order by id desc limit 1", Integer.class);
			if (lastUserId != null) {
				return lastUserId + 1;
			} else {
				return 1;
			}

		} catch (Exception e) {
			System.out.println("No record found ");
			e.printStackTrace();
			return 1;
		}
	}

	public void register(User u) {
		Object[] args = { u.getId(), u.getName(), u.getEmailId(), u.getAddress(), u.getPassword(), u.getPhoneNumber(),
				u.getCountry() };
		template.update("insert into user values (?,?,?,?,?,?,?)", args);

	}

	public User checkUserExist(String emailId) {
		Object[] args = {emailId};
		try {
			User u=template.queryForObject("select * from user where emailId =?", new UserRowMapper(), args);
			return u;
		}catch (Exception e) {
			System.out.println("No record found in checkUserExist()");
			e.printStackTrace();
			return null;
		}
		
	}

	public List<User> getAllUser() {
		try {
			return (List<User>) template.query("select * from user order by name asc", new UserRowMapper(), null);
		}catch (Exception e) {
			System.out.println("No record found in getAllUser() name");
			e.printStackTrace();
			return null;
		}
	}

}
