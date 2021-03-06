package com.blog.mapper;

import com.blog.pojo.Comment;
import com.blog.pojo.CommentWithBLOBs;

public interface CommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommentWithBLOBs record);

    int insertSelective(CommentWithBLOBs record);

    CommentWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommentWithBLOBs record);

    int updateByPrimaryKey(Comment record);
}