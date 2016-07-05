package com.app.service;

import com.app.model.User;

public interface IUserService extends IBaseService<User> {
	
	User getBooks(int id);
}