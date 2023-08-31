package com.example.demo.service;

import java.util.List;

import com.example.demo.utils.Searchinfo;


public interface Basic_service<T> {
	public List<T> select(Searchinfo info);
	
	public void delete(int id);
	
	public void insert(T t);
	
	public void update(T t);
	
	public T getById(int id);
}
