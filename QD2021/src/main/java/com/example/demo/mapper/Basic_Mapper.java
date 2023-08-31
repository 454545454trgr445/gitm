package com.example.demo.mapper;

import java.util.List;


public interface Basic_Mapper <T>{
	
	public List<T> select(String where, String limit);
	
	public void delete(int id);
	
	public void insert(T t);
	
	public void update(T t);
	
	public T getById(int id);
}
