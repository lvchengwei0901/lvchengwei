/**
 * Project Name: lvchengwei
 * File Name: PageDto.java
 * Package Name: com.lcw.entity.dto.pager
 * Date: 2017年12月26日下午4:12:03 
 */

package com.lcw.entity.dto.pager;

import java.util.List;

/** 
 * @ClassName: PageDto
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @param <T>
 * @date: 2017年12月26日 下午4:12:03
 */
public class PageDto<T> {
	
	/** 
	 * 当前页 
	 */  
	private int currentPage;
	
	/** 
	 * 总页数 
	 */  
	private int pageCount;
	
	/** 
	 * 每页数据量
	 */  
	private int pageSize=10;
	
	/** 
	 * 总数据量
	 */  
	private int records;
	
	/** 
	 * 分页返回结果集
	 */  
	private List<T> resultPage;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

	public List<T> getResultPage() {
		return resultPage;
	}

	public void setResultPage(List<T> resultPage) {
		this.resultPage = resultPage;
	}

}
