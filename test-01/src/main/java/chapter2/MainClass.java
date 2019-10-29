package chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring的bean容器创建：
 * ApplicationContext 启动过程中，将配置文件的信息封装成BeanDefintion，存入到
 * beanfactory的map中。当尚未进行初始化等工作，初始化工作看chapter3中
 *
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
