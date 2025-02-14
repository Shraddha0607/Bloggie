package com.project.Bloggie.repository;

import com.project.Bloggie.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails,Integer > {
}
