package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.Basic_Controller;
import com.example.demo.controller.User_Controller;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class Demo2020017Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2020017Application.class, args);
		
	}

}
