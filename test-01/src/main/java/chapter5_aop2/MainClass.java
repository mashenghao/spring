package chapter5_aop2;

import bean.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用BeanNameAutoProxyCreator 来替代自己手动配置代理类，这个扫描规则是匹配类名。
 * 也可以使用更好的DefaultAdvisorAutoProxyCreator，比上面的 BeanNameAutoProxyCreator 还要方便。
 * <p>
 * 之前我们说过，advisor 内部包装了 advice，advisor 负责决定拦截哪些方法，内部 advice 定义拦截后的逻辑。
 * 所以，仔细想想其实就是只要让我们的 advisor 全局生效就能实现我们需要的自定义拦截功能、拦截后的逻辑处理。
 * BeanNameAutoProxyCreator 是自己匹配方法，然后交由内部配置 advice 来拦截处理；
 * <p>
 * 而 DefaultAdvisorAutoProxyCreator 是让 ioc 容器中的所有 advisor 来匹配方法，advisor
 * 内部都是有 advice 的，让它们内部的 advice 来执行拦截处理。
 *
 * @author: mahao
 * @date: 2019/11/8
 */
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:chapter5.xml");

		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.queryUser());
		System.out.println(userService);
	}

}
