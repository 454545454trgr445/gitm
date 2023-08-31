package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;



@Repository
public interface Department_Mapper extends Basic_Mapper<Department> {
	
	@Select("select * from Department ${where} ${limit}")
	public List<Department> select(@Param("where")String where,@Param("limit") String limit);
	
	@Delete("delete from Department where id=#{id}")
	public void delete(int id);
	
	@Insert("insert into Department(name) values(#{name})")
	public void insert(Department t);
	
	@Update("update Department set name=#{name} where id=#{id}")
	public void update(Department t);
	
	@Select("select * from Department where id=#{id}")
	public Department getById(int id);
}
