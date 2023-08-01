package com.sparta.lv4_endrmseha.repository;

import com.sparta.lv4_endrmseha.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
