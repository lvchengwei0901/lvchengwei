/**
 * Project Name: lvchengwei
 * File Name: TestQuartz.java
 * Package Name: com.lcw.quartz
 * Date: 2017年12月26日上午10:10:36 
 */

package com.lcw.quartz;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lcw.service.UserService;

/** 
 * @ClassName: TestQuartz
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月26日 上午10:10:36
 */
@Component
@EnableScheduling
@Lazy(false)
public class TestQuartz {
	
	@Resource
	private UserService userService;
	
	/** 
	 * @Title: testQuartz
	 * @Description:测试定时任务
	 * @author lvchengwei  
	 */  
	//@Scheduled(cron = "0/1 * * * * ? ")
	public void testQuartz(){
		System.out.println(userService.selectUser(2).getName());
	}

}
