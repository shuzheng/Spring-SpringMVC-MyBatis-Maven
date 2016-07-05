package com.app.service;

import com.app.model.Book;

public interface IBookService extends IBaseService<Book> {
	
	Book getUser(int id);
}