package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Department;
import com.example.demo.service.Department_Service;

@RequestMapping("Department")
@RestController
public class Department_Controller extends Basic_Controller<Department>{
	@Autowired
	Department_Service service;
	
	@RequestMapping("test")
	@ResponseBody
	public Department test(Department u) {
		return u;
	}
}
