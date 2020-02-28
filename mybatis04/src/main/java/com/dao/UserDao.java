package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //根据ID查询
    User getUserByID(int id);

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);

    //分页2
    List<User> getUserByRowBounds();

}
