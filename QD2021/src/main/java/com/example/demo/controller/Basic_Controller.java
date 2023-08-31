package com.example.demo.controller;


import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.Basic_service;
import com.example.demo.utils.ResultInfo;
import com.example.demo.utils.Searchinfo;



public class Basic_Controller <T>{
		private Basic_service<T> getBasic(){
			try {
		Field f=this.getClass().getDeclaredField("service");
		f.setAccessible(true);//忽略權限檢查
		return (Basic_service<T>) f.get(this);
			}catch (Exception e) {
				return null;
			}
	}
		
		
		private Class getT() {
	        Type type = ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	        return (Class) type;
		}
	
		
		@RequestMapping("getlist")
		public ResultInfo getlist()throws Exception{
			Object o=getBasic().select(new Searchinfo(false));
			 return new ResultInfo(1,o);  
		}	
		
		@RequestMapping("getArrays")
		public ResultInfo getArrays(String name)throws Exception{
			Object o=getT().getField(name).get(null);
			 return new ResultInfo(1,o);  
		}	
	
		
	@RequestMapping("index")
	public ResultInfo index(Searchinfo info){
		List<T> list=getBasic().select(info);
		 return new ResultInfo(1,list);  
	}
	
	
	@RequestMapping("delete")
	public ResultInfo delete(int id){
		getBasic().delete(id);
		 return new ResultInfo(1);  
	}
	
	@RequestMapping("insert")
	public ResultInfo insert(T t){
		getBasic().insert(t);
		 return new ResultInfo(1);  
	}
	
	@RequestMapping("update")
	public ResultInfo update(T t){
		getBasic().update(t);
		 return new ResultInfo(1);  
	}
	
	@RequestMapping("getInfo")
	public ResultInfo getInfo(int id){
		T info=getBasic().getById(id);
		 return new ResultInfo(1,info);  
	}
}
