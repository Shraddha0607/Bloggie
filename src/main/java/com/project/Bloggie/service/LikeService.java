package com.project.Bloggie.service;

import com.project.Bloggie.models.LikeDetails;
import com.project.Bloggie.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public LikeDetails addLike(LikeDetails like) {
        return likeRepository.save(like);
    }

    public List<LikeDetails> getAllLikes() {
        return likeRepository.findAll();
    }

    public void deleteLike(int id) {
        likeRepository.deleteById(id);
    }
}
