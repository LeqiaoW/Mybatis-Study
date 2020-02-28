package dao;

import com.dao.UserDao;
import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    static Logger logger=Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserByRounbs(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        //RowBounds实现
        RowBounds rowBounds=new RowBounds(1,2);
        //通过Java分页 三个参数：接口类的方法，object,RowBounds
        List<User> users = sqlSession.selectList("com.dao.UserDao.getUserByRowBounds",null,rowBounds);
        for(User user:users){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("startIndex",0);
        hashMap.put("pageSize",2);
        List<User> userByLimit = userDao.getUserByLimit(hashMap);
        for (int i = 0; i < userByLimit.size(); i++) {
            System.out.println(userByLimit);
        }
        sqlSession.close();
    }

    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        logger.info("进入test");

        //执行SQL
        //方法一：getMapper
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        User userList=userDao.getUserByID(1);

        System.out.println(userList);

        //关闭
        sqlSession.close();
    }
    @Test
    public void log4jTest(){
            logger.info("info:进入");
            logger.debug("debug:进入");
            logger.error("error:进入");
    }


}
