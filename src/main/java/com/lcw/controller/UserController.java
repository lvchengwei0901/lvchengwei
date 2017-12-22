/**
 * Project Name: lvchengwei
 * File Name: UserController.java
 * Package Name: com.lcw.controller
 * Date: 2017年12月21日下午6:21:55 
 */

package com.lcw.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lcw.constants.Constants;
import com.lcw.entity.User;
import com.lcw.service.UserService;
import com.lcw.utils.Result;

/** 
 * @ClassName: UserController
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月21日 下午6:21:55
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public Result getUser(HttpServletRequest request,HttpServletResponse response){
		Result result = new Result();
		try {
			long id = 2;
			User selectUser = userService.selectUser(id);
			result.setCode(Constants.SUCCESS);
			result.setMessage(Constants.SUCCESSMSG);
			result.setResult(selectUser);
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(Constants.ERROR);
			result.setCode(Constants.ERRORMSG);
		}
		return result;
	}

}
