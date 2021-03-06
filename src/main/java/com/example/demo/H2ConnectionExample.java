package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("database")
public class H2ConnectionExample {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public String findById(String name) {

		String sql = "SELECT INTERFACEDETAILS FROM Payment WHERE paymenttype=?";
		String streetName = (String) jdbcTemplate.queryForObject(sql, new Object[] { name }, String.class);
		return streetName;

	}
}
