package chapter4_aop1;

import bean.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 介绍AOP配置的三种方式：
 * 一、 spring1.2 基于接口的配置，源码从这里开始，是为每个类配置代理类，指定切点和切面。
 * 二、 spring2.0 schema-based配置，基于xml的配置，使用命名空间<aop/>，学习的时候接触的。
 * 三、 spring2.0 @AspectJ注解配置，配置切面，切点和通知。
 * <p>
 * <p>
 * <p>
 * 下面是AOP的第一种，使用接口的配置方式，这个是aop实现的第一种，是手动代理，比较简单，实现涉及的操作，
 * 和动态代理是相似的，能找到很多的相同点。
 * 1.创建两个服务类，让aop拦截操作他们。
 * 2.创建两个通知类，用于方法的参数拦截和返回值记录，需要实现MethodBeforeAdvice ，  AfterReturningAdvice
 * 3.为需要增强的bean配置代理类，这些代理类中会调用配置的通知.具体配置包括通知，代理类生成，代理类中的通知。
 * 4.上面的逻辑只能实现拦截代理类中所有的方法，可以实现Advisor，让他去实现增强某些方法。
 *
 * @author: mahao
 * @date: 2019/11/7
 */
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:chapter4.xml");
		//这里要获取的是代理类，特别重要
		UserService userService = (UserService) context.getBean("userServicePorxy");
		System.out.println(userService.queryUser());
		System.out.println(userService.toString());

	}
}
