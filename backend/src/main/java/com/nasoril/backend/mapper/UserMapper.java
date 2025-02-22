package com.nasoril.backend.mapper;


import com.nasoril.backend.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User findByUserName(String username);

    @Insert("insert into user(username,password) values(#{username},#{password})")
    void add(String username, String password);
}
