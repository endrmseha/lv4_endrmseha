package com.sparta.lv4_endrmseha.repository;

import com.sparta.lv4_endrmseha.entity.Comment;
import com.sparta.lv4_endrmseha.entity.CommentLike;
import com.sparta.lv4_endrmseha.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {
    Optional<CommentLike> findByUserAndComment(User user, Comment comment);
    Boolean existsByUserAndComment(User user, Comment comment);
}
