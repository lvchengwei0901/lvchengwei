/**
 * Project Name: lvchengwei
 * File Name: UserDao.java
 * Package Name: com.lcw.dao
 * Date: 2017年12月21日下午6:10:09 
 */

package com.lcw.dao;

import org.springframework.stereotype.Repository;

import com.lcw.entity.User;

/** 
 * @ClassName: UserDao
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月21日 下午6:10:09
 */
@Repository
public interface UserDao {
	
	public void addUser(User user);
	
	public void deleteUser(long id);
	
	public void updateUser(int age,long id);
	
	public User selectUser(long id);

}
