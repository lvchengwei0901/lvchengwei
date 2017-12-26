/**
 * Project Name: lvchengwei
 * File Name: TestService.java
 * Package Name: junit
 * Date: 2017年12月26日上午10:18:39 
 */

package junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;

import utils.TestUtil;

import com.lcw.service.UserService;

/** 
 * @ClassName: TestService
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月26日 上午10:18:39
 */
public class TestService {
	
	@Test
	public void tsetService(){
		ApplicationContext ctx = TestUtil.getCtx();
		UserService userService = ctx.getBean(UserService.class);
		System.out.println(userService.selectUser(3).getName());
	}

}
