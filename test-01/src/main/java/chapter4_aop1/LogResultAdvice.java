package chapter4_aop1;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author: mahao
 * @date: 2019/11/8
 */
public class LogResultAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("方法的返回值" +  returnValue);
	}
}
