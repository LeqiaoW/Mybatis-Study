package dao;

import com.dao.UserDao;
import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        //执行SQL

        //方法一：getMapper
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        User userList=userDao.getUserByID(1);

        System.out.println(userList);

        //关闭
        sqlSession.close();
    }




}
