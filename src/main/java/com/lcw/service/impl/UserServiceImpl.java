/**
 * Project Name: lvchengwei
 * File Name: UserServiceImpl.java
 * Package Name: com.lcw.service.impl
 * Date: 2017年12月21日下午6:19:50 
 */

package com.lcw.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.lcw.dao.UserDao;
import com.lcw.entity.User;
import com.lcw.entity.dto.UserDto;
import com.lcw.entity.query.UserQuery;
import com.lcw.service.UserService;

/** 
 * @ClassName: UserServiceImpl
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月21日 下午6:19:50
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public void deleteUser(long id) {
		userDao.deleteUser(id);
	}

	public void updateUser(int age, long id) {
		userDao.updateUser(age, id);
	}

	public User selectUser(long id) {
		return userDao.selectUser(id);
	}

	public void testTransaction() {
		userDao.updateUser(11, 2);
		System.out.println("----------------------");
		@SuppressWarnings("unused")
		int b = 3/0;
		userDao.updateUser(11, 3);
	}

	public List<UserDto> queryUser(UserQuery userQuery) {
		List<UserDto> userDtos = new ArrayList<UserDto>();
		List<User> users = userDao.queryUser(userQuery);
		if(users != null && users.size() > 0){
			for(User user:users){
				UserDto userDto = new UserDto();
				BeanUtils.copyProperties(user, userDto);
				userDtos.add(userDto);
			}
		}
		return userDtos;
	}

}
