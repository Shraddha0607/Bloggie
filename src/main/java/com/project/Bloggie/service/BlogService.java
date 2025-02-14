package com.project.Bloggie.service;

import com.project.Bloggie.models.Blog;
import com.project.Bloggie.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    BlogRepository blogRepository;

    public Blog createBlog(Blog blog){
        Blog blogCreated = blogRepository.save(blog);
        return blogCreated;

    }
    public List<Blog> getAllBlogs(){
        List<Blog> lstBlog = getAllBlogs();   // why not findAll()
        return lstBlog;
    }
    public Blog getBlogById(int id){
        Blog blog = getBlogById(id);  // Blog blog = getBlogById(id).orElse(null);
        if(blog == null) return null;
        return  blog;
    }
    public String deleteBlog(int id){
        deleteBlog(id);
        return "Deleted successfully";
    }



}
