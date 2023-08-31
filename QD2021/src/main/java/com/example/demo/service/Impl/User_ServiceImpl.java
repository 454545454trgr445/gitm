package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.User_Service;
import com.example.demo.utils.Searchinfo;
@Service
public class User_ServiceImpl extends  Basic_serviceimpl<User> implements User_Service {
	@Override
	public List<User> select(Searchinfo info) {
		String where="";
		if(info.getSearch()!=null&&info.getSearch().length()>0) {
			where =" where user.name like '%"+info.getSearch()+"%' ";
		}
		info.setWhere(where);
		return super.select(info);
	}
}
