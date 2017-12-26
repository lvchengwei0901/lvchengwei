/**
 * Project Name: lvchengwei
 * File Name: UserDto.java
 * Package Name: com.lcw.entity.dto
 * Date: 2017年12月26日下午3:12:19 
 */

package com.lcw.entity.dto;

import java.util.Date;

import com.lcw.utils.Page;

/** 
 * @ClassName: UserDto
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月26日 下午3:12:19
 */
public class UserDto extends Page{
	
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
	
	/** 
	 * 逻辑删除 
	 */  
	private boolean isDelete;

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

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

}
