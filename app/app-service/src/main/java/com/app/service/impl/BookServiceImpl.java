package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.mapper.BookMapper;
import com.app.model.Book;
import com.app.service.IBookService;

@Service
@Transactional
public class BookServiceImpl extends BaseServiceImpl<Book> implements IBookService {

	@Autowired
	private BookMapper bookMapper;

	@Override
	public Book getUser(int id) {
		return bookMapper.getUser(id);
	}
	
}