package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUser();

    //方法中存在多个参数，所有参数前面都要加上注解@Param("id")
    @Select("select * from user where id= #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);

    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int upDateUser(User user);
}
