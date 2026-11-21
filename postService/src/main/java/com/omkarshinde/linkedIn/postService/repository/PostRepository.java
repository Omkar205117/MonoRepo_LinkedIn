package com.omkarshinde.linkedIn.postService.repository;

import com.omkarshinde.linkedIn.postService.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUserId(Long userId);
}
