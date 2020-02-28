package com.dao;

import com.pojo.Blog;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlog(Map map);

    //选择查询
    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int upDateBlog(Map map);

    //Foreach查询
    List<Blog> queryBlogForeach(Map map);
}
