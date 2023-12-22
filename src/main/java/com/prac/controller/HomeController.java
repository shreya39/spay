package com.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prac.dao.HomeDAO;

@Controller
public class HomeController {

	@Autowired
	HomeDAO homedao;
	
	@GetMapping("/add")
	public String getCard() {
		return "cred";
	}
	
	@GetMapping("/net")
	public String getNet() {
		return "net";
	}
	
	@GetMapping("/upi")
	public String getUpi() {
		return "upi";
	}
	
	@PostMapping("/netpay")
	public String checkAcc(@RequestParam String acc_no,@RequestParam String acc_name,
			@RequestParam int money) {
		
		boolean flag=homedao.validateAcc(acc_no,acc_name,money);
		if(flag==true)
			return "success";
		else
			return "error";
	}
	
	@PostMapping("/dopymt")
	public ModelAndView checkCard(@RequestParam String cNo,@RequestParam String cName,
			@RequestParam int cvv,@RequestParam int amt) {
		
		ModelAndView mv=new ModelAndView();
		int pp=homedao.getData(cNo);
		
		boolean flag=homedao.validateCard(cNo,cName,cvv,amt);
		if(flag==true) {
			mv.setViewName("success");
			mv.addObject("card_data",pp);
			System.out.println(pp);
		}
		else
			mv.setViewName("error");
		
		return mv;
	}

	@PostMapping("/upipay")
	public String checkUpi(@RequestParam String upi_app,@RequestParam String upi_id,
			@RequestParam int upi_amt) {
		
		boolean flag=homedao.validateUpi(upi_app,upi_id,upi_amt);
		if(flag==true)
			return "success";
		else
			return "error";
	}
	/*@PostMapping("/dopymt")
	public String checkCard(@RequestParam String cNo,@RequestParam String cName,
			@RequestParam int cvv,@RequestParam int amt) {
		
		boolean flag=homedao.validateCard(cNo,cName,cvv,amt);
		if(flag==true)
			return "success";
		else
			return "error";
	}*/

}
