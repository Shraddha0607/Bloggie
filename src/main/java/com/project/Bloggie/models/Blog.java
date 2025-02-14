package com.project.Bloggie.models;

import com.project.Bloggie.Enum.Topic;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blogId;

    private String title;
    private String content;
    private String imageUrl;
    private Date createdOn = new Date();

    @Enumerated(EnumType.STRING)
    private Topic category;

//    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL, orphanRemoval = true)
    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
    private List<LikeDetails> lstLikes = new ArrayList<>();

    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
    private List<Comment> lstComments = new ArrayList<>();
}

