package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.service.User_Service;

@RequestMapping("User")
@RestController
public class User_Controller extends Basic_Controller<User>{
	@Autowired
	User_Service service;
	
	@RequestMapping("test")
	@ResponseBody
	public User test(User u) {
		return u;
	}
}
