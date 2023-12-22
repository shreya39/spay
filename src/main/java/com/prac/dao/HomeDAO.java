package com.prac.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean validateCard(String cNo,String cName,int cvv, int amt ) {
		
		int count=jdbcTemplate.queryForObject("select count(*) from cards where cNo=? and cName=? and cvv=? and amt=?"
				 ,Integer.class,cNo,cName,cvv,amt);
		
		if(count==1)
			return true;
		else
			return false;
	}
	
	public int getData(String cNo) {
		
		int amount=jdbcTemplate.queryForObject("select amt from cards where cNo=?",Integer.class,cNo);
	    return amount;
	}

	public boolean validateAcc(String acc_no, String acc_name, int money) {
		// TODO Auto-generated method stub
		int count=jdbcTemplate.queryForObject("select count(*) from accounts where acc_no=? and acc_name=? and money=?"
				 ,Integer.class,acc_no,acc_name,money);
		
		if(count==1)
			return true;
		else
			return false;
	}

	public boolean validateUpi(String upi_app, String upi_id, int upi_amt) {
		// TODO Auto-generated method stub
		int count=jdbcTemplate.queryForObject("select count(*) from upis where upi_app=? and upi_id=? and upi_amt=?"
				 ,Integer.class,upi_app,upi_id,upi_amt);
		
		if(count==1)
			return true;
		else
			return false;
	}
}
