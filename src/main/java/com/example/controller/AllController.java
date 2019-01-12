package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AllController {

	
	@RequestMapping("/ss")//登入lalala
	public String login() {
		return "index.html";
	}
	
}
