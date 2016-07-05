package com.app.mapper;

import org.springframework.stereotype.Repository;

import com.app.model.User;

@Repository
public interface UserMapper extends BaseMapper<User> {

	User getBooks(int id);
}