package chapter4_aop1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 前置通知，拦截参数
 *
 * @author: mahao
 * @date: 2019/11/8
 */
public class LogArgsAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("准备执行的方法" + method.getName() + ",参数是 [" + Arrays.toString(args) + "]");
	}
}
