package chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring的bean容器创建：
 * ApplicationContext 启动过程中，
 * 会负责创建实例 Bean，往各个 Bean 中注入依赖等
 *
 * @author: mahao
 * @date: 2019/10/28
 */
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("classpath:spring01.xml");
		Object user = context.getBean("user");
		System.out.println(user);
	}
}
