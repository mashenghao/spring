package chapter6_aop3_aspectJ;


import org.aspectj.lang.annotation.*;

/**
 * @author: mahao
 * @date: 2019/11/8
 */
@Aspect
public class AdviceExample {

	// 这里会用到我们前面说的 SystemArchitecture
	// 下面方法就是写拦截 "dao层实现"
	@Before("chapter6_aop3_aspectJ.MyAspect.dataAccessOperation()")
	public void doAccessCheck() {
		// ... 实现代码
	}

	// 当然，我们也可以直接"内联"Pointcut，直接在这里定义 Pointcut
	// 把 Advice 和 Pointcut 合在一起了，但是这两个概念我们还是要区分清楚的
	@Before("execution(* com..dao.*.*(..))")
	public void doAccessCheck2() {
		// ... 实现代码
	}

	/**
	 * 返回通知，需要指定返回的参数值
	 *
	 * @param result
	 */
	@AfterReturning(value = "execution(* chapter6_aop3_aspectJ.*.*(..))", returning = "result")
	public void afterReturn(Object result) {
		System.out.println("后置增强 ...");
	}

	// 异常返回
	/*@AfterThrowing(value = "com..aop.SystemArchitecture.dataAccessOperation()", throwing = "ex")
	public void doRecoveryActions(Throwable ex) {
		// ... 实现代码
	}*/

	/*// 感觉这个很有用吧，既能做 @Before 的事情，也可以做 @AfterReturning 的事情
	@Around("com..aop.SystemArchitecture.businessService()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		// start stopwatch
		Object retVal = pjp.proceed();
		// stop stopwatch
		return retVal;
	}*/
}
