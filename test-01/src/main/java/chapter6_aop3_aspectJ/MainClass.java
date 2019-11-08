package chapter6_aop3_aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring2.0 中对aop的支持，支持使用@AspectJ注解和xml配置方法。
 * 注意了，@AspectJ 和 AspectJ 没多大关系，并不是说基于 AspectJ 实现的，
 * 而仅仅是使用了 AspectJ 中的概念，包括使用的注解也是直接来自于 AspectJ 的包。
 * 1.需要在配置文件中开启aop的代理，使用<aop:aspectj-autoproxy/> 或者@EnableAspectJAutoProxy注解，
 * 这样会吧标注了@Aspect的bean作为切面。
 * 2.创建切面类，被@Aspect修饰
 * 3.定义切点，确定拦截的方法，@Pointcut("表达式") ,表达式看切面类介绍
 *
 * @author: mahao
 * @date: 2019/11/8
 */
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:chapter6.xml");
		MyService bean = context.getBean(MyService.class);
		bean.doThings();
	}
}
