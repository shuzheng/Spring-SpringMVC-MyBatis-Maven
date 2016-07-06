package com.app.service;

import java.util.List;
import java.util.Map;

import com.app.mapper.UserMapper;
import com.app.model.User;
import com.app.model.UserVO;

/**
 * 用户service接口
 * @author shuzheng
 * @date 2016年7月6日 下午6:03:45
 */
public interface UserService {

	/**
	 * 获取基本操作mapper
	 * @return
	 */
	UserMapper getMapper();
	
	/**
	 * 获取带book数据的用户
	 * @param id
	 * @return
	 */
	UserVO selectUserWithBook(int id);

	/**
	 * 根据条件获取用户列表
	 * @param map
	 * @return
	 */
	List<User> selectAll(Map<String, Object> map);

	/**
	 * 插入用户并返回主键
	 * @param user
	 */
	void insertAutoKey(User user);
	
}