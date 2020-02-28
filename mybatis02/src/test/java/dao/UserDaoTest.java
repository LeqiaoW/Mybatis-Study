package dao;

import com.dao.UserDao;
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

}
