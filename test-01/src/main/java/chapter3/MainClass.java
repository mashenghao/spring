package chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring管理bean的生命周期
 *
 * @author: mahao
 * @date: 2019/10/29
 */
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("classpath:chapter3.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
	}
}
