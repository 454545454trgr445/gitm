package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;



@Repository
public interface User_Mapper extends Basic_Mapper<User> {
	
	@Select("select user.*,department.name department_name from user inner join department"
			+ " on user.department_id=department.id  ${where} ${limit}")
	public List<User> select(@Param("where")String where,@Param("limit") String limit);
	
	@Delete("delete from user where id=#{id}")
	public void delete(int id);
	
	@Insert("insert into user(name,sex,department_id) values(#{name},#{sex},#{department_id})")
	public void insert(User t);
	
	@Update("update user set name=#{name},sex=#{sex},department_id=#{department_id} where id=#{id}")
	public void update(User t);
	
	@Select("select * from user where id=#{id}")
	public User getById(int id);
}
