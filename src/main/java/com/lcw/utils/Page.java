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
	 * 当前页 （默认当前页为第一页）
	 */  
	private int currentPage=1;
	
	/** 
	 * 总页数 
	 */  
	private int pageCount;
	
	/** 
	 * 每页数据量
	 */  
	private int pageSize=10;
	
	/** 
	 * 总数据量（条数）
	 */  
	private int records;
	
	public int getCurrentPage() {
		if (currentPage == 0) {
			return 1;
		}
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
		if(this.currentPage==0){
			return 0;
		}else{
			return (this.currentPage - 1) * this.pageSize;			
		}
	}

}
