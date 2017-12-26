/**
 * Project Name: lvchengwei
 * File Name: UserController.java
 * Package Name: com.lcw.controller
 * Date: 2017年12月21日下午6:21:55 
 */

package com.lcw.controller;

import java.util.List;

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
import com.lcw.entity.dto.UserDto;
import com.lcw.entity.query.UserQuery;
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
	
	@RequestMapping("/testTransaction")
	public void testTransaction(HttpServletRequest request,HttpServletResponse response){
		try {
			userService.testTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/findUser")
	public String findUser(HttpServletRequest request,HttpServletResponse response,long id,Model model){
		try {
			User selectUser = userService.selectUser(id);
			if(selectUser != null){
				model.addAttribute("selectUser",selectUser);
				return "user/user";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error/error";
		}
		return "error/error";
	}
	
	@RequestMapping("/findJspUser")
	public ModelAndView findJspUser(HttpServletRequest request,HttpServletResponse response,long id,Model model){
		try {
			User selectUser = userService.selectUser(id);
			if(selectUser != null){
				model.addAttribute("selectUser",selectUser);
				return new ModelAndView("hello");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("hello");
		}
		return new ModelAndView("hello");
	}
	
	@RequestMapping("/queryUser")
	@ResponseBody
	public Result queryUser(HttpServletRequest request,HttpServletResponse response,UserQuery userQuery){
		Result result = new Result();
		try {
			userQuery.setCurrentPage(3);
			userQuery.setPageSize(2);
			List<UserDto> userDtos = userService.queryUser(userQuery);
			result.setCode(Constants.SUCCESS);
			result.setMessage(Constants.SUCCESSMSG);
			result.setResult(userDtos);
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(Constants.ERROR);
			result.setCode(Constants.ERRORMSG);
		}
		return result;
	}

}
