package com.pany.mapper;

import com.pany.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where name =#{name}")
    User findByName(String name);

    @Select("select * from user where userId =#{userId}")
    User findById(Integer userId);


    @Insert("insert into user (name,email,pwd) values (#{name},#{email},#{pwd})")
    void add(String name, String email,String pwd);

}
