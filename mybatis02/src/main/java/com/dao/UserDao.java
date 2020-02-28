package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();


    //根据ID查询
    User getUserByID(int id);

    //插入用户
    int adddUser(User user);

    //修改
    int updateUser(User user);

    //删除
    int deleteUser(User user);



}
