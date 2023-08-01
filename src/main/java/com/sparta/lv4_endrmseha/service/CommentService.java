package com.sparta.lv4_endrmseha.service;

import com.sparta.lv4_endrmseha.dto.CommentRequestDto;
import com.sparta.lv4_endrmseha.dto.CommentResponseDto;
import com.sparta.lv4_endrmseha.entity.Comment;
import com.sparta.lv4_endrmseha.entity.User;

public interface CommentService {

    /**
     * 댓글 생성
     * @param requestDto 댓글 생성 요청정보
     * @param user 댓글 생성 요청자
     * @return 생성된 댓글 정보
     */
    CommentResponseDto createComment(CommentRequestDto requestDto, User user);

    /**
     * 댓글 수정
     * @param comment
     * @param requestDto
     * @param user
     * @return
     */
    CommentResponseDto updateComment(Comment comment, CommentRequestDto requestDto, User user);

    void deleteComment(Comment comment, User user);

    void likeComment(Long id, User user);

    void deleteLikeComment(Long id, User user);

    Comment findComment(long id);
}
