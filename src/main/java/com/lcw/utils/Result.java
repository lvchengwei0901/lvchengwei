/**
 * Project Name: lvchengwei
 * File Name: Result.java
 * Package Name: com.lcw.utils
 * Date: 2017年12月21日下午6:26:57 
 */

package com.lcw.utils;
/** 
 * @ClassName: Result
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月21日 下午6:26:57
 */
public class Result {
	
	/** 
	 * 结果值 
	 */  
	private String code;
	
	/** 
	 * 描述 
	 */  
	private String message;
	
	/** 
	 * 结果 
	 */  
	private Object result;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
