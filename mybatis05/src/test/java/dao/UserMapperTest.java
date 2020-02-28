package dao;

import com.dao.UserMapper;
import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();

        //核心是反射
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

        mapper.upDateUser(new User(5,"好好","666777"));
        sqlSession.close();
    }
      /*
      List<User> user = mapper.getUser();
     for (User user1 : user) {
           System.out.println(user1);
      }

       User user = mapper.getUserById(1);
      System.out.println(user);


     mapper.addUser(new User(5,"久久","123654"));
     */

}
