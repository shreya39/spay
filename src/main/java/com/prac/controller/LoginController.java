package com.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prac.dao.LoginDAO;

@Controller
public class LoginController {
	
	@Autowired
	LoginDAO logindao;
	
	@PostMapping("/dologin")
	public String checkUser(@RequestParam String uName,@RequestParam String uPass) {
		
		boolean flag=logindao.validateUser(uName, uPass);
		if(flag==true)
			return "home";
		else
			return "error";
	}
}
