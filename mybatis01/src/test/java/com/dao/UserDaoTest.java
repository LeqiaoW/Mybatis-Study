package com.dao;

import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        //执行SQL

        //方法一：getMapper
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<User> userList=userDao.getUserList();

        for(User user:userList){
            System.out.println(user);
        }

        //关闭
        sqlSession.close();
    }

    @Test
    public void getUserByID(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user=userDao.getUserByID(1);
        System.out.println(user);

        sqlSession.close();
    }

    //增删改查要提交事务
    @Test
    public void adddUser2(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map map=new HashMap<String,Object>();
        map.put("myname","王五");
        map.put("myid",6);
        map.put("mypwd","9999");
        int res=userDao.adddUser2(map);
        if(res>0){
            System.out.println("success");
        }
        //提交事务！！！
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void adddUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int res=userDao.adddUser(new User(4,"李四","6666"));
        if(res>0){
            System.out.println("success");
        }
        //提交事务！！！
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int res=userDao.updateUser(new User(4,"李四","123456"));
        if(res>0){
            System.out.println("success");
        }
        //提交事务！！！
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int res=userDao.deleteUser(new User(4,"李四","123456"));
        if(res>0){
            System.out.println("success");
        }
        //提交事务！！！
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUseByName(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> user=userDao.getUseByName("%王%");

        for (User user1 : user) {
            System.out.println(user1);
        }

        sqlSession.close();
    }
}
