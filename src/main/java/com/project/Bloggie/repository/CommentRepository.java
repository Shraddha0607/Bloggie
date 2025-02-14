package com.project.Bloggie.repository;

import com.project.Bloggie.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer > {
}
