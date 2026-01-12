package com.springbootstudy.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.springbootstudy.app.domain.user;

@Mapper
public interface userMapper {
	
 public void addUser(user user);
 
}

