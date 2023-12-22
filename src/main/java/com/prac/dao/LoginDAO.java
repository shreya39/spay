package com.prac.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean validateUser(String uName,String uPass ) {
		
		int count=jdbcTemplate.queryForObject("select count(*) from users where uName=? and uPass=?"
				, Integer.class,uName,uPass);
		
		if(count==1)
				return true;
		else
			return false;
	}

}
