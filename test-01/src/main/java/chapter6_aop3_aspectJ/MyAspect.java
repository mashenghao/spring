package chapter6_aop3_aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切面类
 *
 * @author: mahao
 * @date: 2019/11/8
 */
@Aspect
public class MyAspect {

	/**
	 * 关于切点表达式，有四种，
	 * 1.正则表示式("execution(* cn.service..*(..))"),匹配service包下的所有方法
	 * 2.within：指定所在类或所在包下面的方法（Spring AOP 独有）
	 *      如 @Pointcut("within(com.javadoop.springaoplearning.service..*)")
	 * 3.@annotation：方法上具有特定的注解，如 @Subscribe 用于订阅特定的事件。
	 * 		如 @Pointcut("execution(* .(..)) && @annotation(com.javadoop.annotation.Subscribe)")
	 * 4. bean(idOrNameOfBean)：匹配 bean 的名字（Spring AOP 独有）
	 * 		如 @Pointcut("bean(*Service)")
	 */
	// web 层
	@Pointcut("within(com..web..*)")
	public void inWebLayer() {}

	// service 层
	@Pointcut("within(com..service..*)")
	public void inServiceLayer() {}

	// dao 层
	@Pointcut("within(com..dao..*)")
	public void inDataAccessLayer() {}

	// service 实现，注意这里指的是方法实现，其实通常也可以使用 bean(*ServiceImpl)
	@Pointcut("execution(* com..service.*.*(..))")
	public void businessService() {}

	// dao
	@Pointcut("execution(* com..dao.*.*(..))")
	public void dataAccessOperation() {}
}
