package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //根据id查用户

    User getUserById(@Param("id") int id);
    User getUserById2(@Param("id") int id);
}
