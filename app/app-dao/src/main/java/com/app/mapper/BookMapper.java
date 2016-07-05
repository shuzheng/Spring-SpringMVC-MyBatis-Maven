package com.app.mapper;

import org.springframework.stereotype.Repository;

import com.app.model.Book;

@Repository
public interface BookMapper extends BaseMapper<Book> {
	
	Book getUser(int id);
}