package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.annotations.Param;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;


}
