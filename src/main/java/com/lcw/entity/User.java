/**
 * Project Name: lvchengwei
 * File Name: User.java
 * Package Name: com.lcw.entity
 * Date: 2017年12月21日下午3:14:15 
 */

package com.lcw.entity;

import java.util.Date;

/** 
 * @ClassName: User
 * @Description:用户类
 * 
 * @author lvchengwei
 * @date: 2017年12月21日 下午3:14:15
 */
public class User {
	
	/** 
	 * 主键
	 */  
	private long id;
	
	/** 
	 * 名字 
	 */  
	private String name;
	
	/** 
	 * 年龄 
	 */  
	private int age;
	
	/** 
	 * 创建时间 
	 */  
	private Date createTime;
	
	/** 
	 * 修改时间 
	 */  
	private Date updateTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
