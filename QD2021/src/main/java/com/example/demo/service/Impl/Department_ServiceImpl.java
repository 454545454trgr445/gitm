package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.service.Department_Service;
import com.example.demo.utils.Searchinfo;
@Service
public class Department_ServiceImpl extends  Basic_serviceimpl<Department> implements Department_Service {
	@Override
	public List<Department> select(Searchinfo info) {
		String where="";
		if(info.getSearch()!=null&&info.getSearch().length()>0) {
			where =" where name like '%"+info.getSearch()+"%' ";
		}
		info.setWhere(where);
		return super.select(info);
	}
}
