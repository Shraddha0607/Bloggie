package com.project.Bloggie.controller;
import com.project.Bloggie.models.LikeDetails;
import com.project.Bloggie.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @PostMapping
    public LikeDetails addLike(@RequestBody LikeDetails like) {
        return likeService.addLike(like);
    }

    @GetMapping
    public List<LikeDetails> getAllLikes() {
        return likeService.getAllLikes();
    }

    @DeleteMapping("/{id}")
    public void deleteLike(@PathVariable int id) {
        likeService.deleteLike(id);
    }
}
