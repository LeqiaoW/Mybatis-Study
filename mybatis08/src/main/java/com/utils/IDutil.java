package com.utils;

import java.util.UUID;

public class IDutil {
    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
