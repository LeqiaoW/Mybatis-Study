import com.dao.TeacherMapper;
import com.pojo.Teacher;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {

    @Test
    public void testTeacher(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class) ;
        Teacher teacher1 = mapper.getTeacher2(1);
        System.out.println(teacher1);
        sqlSession.close();
    }
}
