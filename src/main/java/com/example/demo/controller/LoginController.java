package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.User;
import com.example.demo.repo.Loginrepo;

@Controller
public class LoginController {
	
	@Autowired
	Loginrepo repo;
	
	@RequestMapping("/")
	public String signup(User user) {
		return "signup";
	}
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public String signup(@Valid User user,BindingResult result ,Model model) {
		String encoded=new BCryptPasswordEncoder().encode(user.getPassword());
		System.out.println(user.getPassword());
		user.setPassword(encoded);
		System.out.println(encoded);
		repo.save(user);
		
		return "redirect:/home";
		
	}
	@GetMapping("/home")
	public String home( User model) {
		return "home";
	}
		
	
	

}
