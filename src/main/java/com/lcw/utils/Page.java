/**
 * Project Name: lvchengwei
 * File Name: Page.java
 * Package Name: com.lcw.utils
 * Date: 2017年12月26日下午2:10:28 
 */

package com.lcw.utils;
/** 
 * @ClassName: Page
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月26日 下午2:10:28
 */
public class Page {
	
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
	 * 初始查询的数据
	 */  
	private int startRecord;

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

	public int getStartRecord() {
		return startRecord;
	}

	public void setStartRecord(int startRecord) {
		this.startRecord = startRecord;
	}
	
}
