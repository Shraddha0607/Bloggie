package com.project.Bloggie.repository;

import com.project.Bloggie.models.LikeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<LikeDetails,Integer > {
}
