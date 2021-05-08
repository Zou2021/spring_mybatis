package com.zou.mapper;

import com.zou.entity.User;

import java.util.List;

/**
 * @author: 邹祥发
 * @date: 2021/5/8 14:35
 */
public interface UserMapper {
    List<User> selectList() throws Exception;
}
