package chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC(控制反转)
 * 对于IOC比较重要的就是创建bean容器和初始化话bean。
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
