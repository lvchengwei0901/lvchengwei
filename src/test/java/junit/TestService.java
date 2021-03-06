/**
 * Project Name: lvchengwei
 * File Name: TestService.java
 * Package Name: junit
 * Date: 2017年12月26日上午10:18:39 
 */

package junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import utils.TestUtil;

import com.lcw.entity.User;
import com.lcw.service.UserService;

/** 
 * @ClassName: TestService
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月26日 上午10:18:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class TestService {
	
	@Resource
	private UserService userService;
	
	@Test
	public void tsetService(){
		//ApplicationContext ctx = TestUtil.getCtx();
		//UserService userService = ctx.getBean(UserService.class);
		System.out.println(userService.selectUser(8).getName());
	}
	
	@Test
	public void addUser(){
		User user = new User();
		user.setAge(26);
		user.setName("杰克");
		userService.addUser(user);
	}

}
