package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.Basic_Mapper;
import com.example.demo.mapper.User_Mapper;
import com.example.demo.service.Basic_service;
import com.example.demo.utils.Searchinfo;

public class Basic_serviceimpl <T> {
	@Autowired
	Basic_Mapper<T> mapper;
	
	
	public List<T> select(Searchinfo info) {
		
		return mapper.select(info.getWhere(),info.getlimit());
	}
	
	public void delete(int id) {
	mapper.delete(id);	
	}
	
	public void insert(T t) {
		mapper.insert(t);
	}
	
	public void update(T t) {
		mapper.update(t);
	}
	
	public T getById(int id) {
		return mapper.getById(id);
	}

}
