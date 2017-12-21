/**
 * Project Name: lvchengwei
 * File Name: UserService.java
 * Package Name: com.lcw.service
 * Date: 2017年12月21日下午6:19:00 
 */

package com.lcw.service;

import com.lcw.entity.User;

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

}
