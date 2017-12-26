/**
 * Project Name: lvchengwei
 * File Name: TestUtil.java
 * Package Name: utils
 * Date: 2017年12月26日上午10:31:06 
 */

package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @ClassName: TestUtil
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author lvchengwei
 * @date: 2017年12月26日 上午10:31:06
 */
public class TestUtil {
	
	public static ApplicationContext getCtx(){
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring.xml");
			return ctx;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
