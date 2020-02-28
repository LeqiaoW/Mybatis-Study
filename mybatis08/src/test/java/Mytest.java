import com.dao.BlogMapper;
import com.pojo.Blog;
import com.utils.IDutil;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class Mytest {
    @Test
    public void testBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutil.genId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDutil.genId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDutil.genId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDutil.genId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        session.close();
    }

    @Test
    public void testQuery(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String,String> map=new HashMap();
        map.put("title","Java如此简单");
        List<Blog> blogs = mapper.queryBlog(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void testChoose(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        map.put("title","Java如此简单");
        map.put("views",9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void testSet(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        map.put("title","Java如此简单单");
        map.put("id","8f12bd410662486ab883977e357cf271");
        mapper.upDateBlog(map);

        sqlSession.close();
    }

    @Test
    public void testForeach(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        hashMap.put("list",list);

        List<Blog> blogs = mapper.queryBlogForeach(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
