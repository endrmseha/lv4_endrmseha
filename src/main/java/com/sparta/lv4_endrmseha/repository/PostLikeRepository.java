package com.sparta.lv4_endrmseha.repository;

import com.sparta.lv4_endrmseha.entity.Post;
import com.sparta.lv4_endrmseha.entity.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostLikeRepository extends JpaRepository<PostLike, Long> {
    Optional<PostLike> findByUserAndPost(User user, Post post);
    Boolean existsByUserAndPost(User user, Post post);
}
