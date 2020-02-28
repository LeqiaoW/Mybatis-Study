import com.dao.UserMapper;
import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {


    @Test
    public void testCash(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession1.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();

        User user2 = mapper2.getUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);

        sqlSession1.close();

    }

}
