package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> findAll() {
		return jdbcTemplate.query("select * from logindetails", new BeanPropertyRowMapper<User>(User.class));
	}

	// using prepareStatement to execute query
	public User getById(int id) {
		User queryForObject = jdbcTemplate.queryForObject("select * from logindetails where id=?", new Object[] { 0 },
				new BeanPropertyRowMapper<User>(User.class));
		return queryForObject;
	}

	// RowMapper implementation by java 8
	public List<User> findAll1() {
		return jdbcTemplate.query("select * from logindetails", (rs, rowNum) -> {
			User user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPassword(rs.getString(3));
			// user.setDob(rs.getString(4));

			return user;
		});
	}
	
	public int deleteById() {
		return jdbcTemplate.update("delete from logindetails where id = 0");
	}
	
	public int updateName() {
		return jdbcTemplate.update("update logindetails set name=? where id = ?", new Object[]{"madhu", 1});
	}
}
