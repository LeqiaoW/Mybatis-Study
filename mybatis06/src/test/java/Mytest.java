import com.dao.StudentMapper;
import com.dao.TeacherMapper;
import com.pojo.Student;
import com.pojo.Teacher;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {

    @Test
    public void Mytest() {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testStudent(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }

    @Test
    public void testStudent2(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
