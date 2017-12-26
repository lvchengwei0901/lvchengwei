/**
 * Project Name: lvchengwei
 * File Name: UserService.java
 * Package Name: com.lcw.service
 * Date: 2017年12月21日下午6:19:00 
 */

package com.lcw.service;

import java.util.List;

import com.lcw.entity.User;
import com.lcw.entity.dto.UserDto;
import com.lcw.entity.query.UserQuery;

/** 
 * @ClassName: UserService
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月21日 下午6:19:00
 */
public interface UserService {
	
	public void addUser(User user);
	
	public void deleteUser(long id);
	
	public void updateUser(int age,long id);
	
	public User selectUser(long id);
	
	public void testTransaction();
	
	public List<UserDto> queryUser(UserQuery userQuery);

}
