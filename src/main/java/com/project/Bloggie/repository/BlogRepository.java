package com.project.Bloggie.repository;

import com.project.Bloggie.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer > {
}
