package chapter3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author: mahao
 * @date: 2019/10/29
 */
public class Person implements BeanFactoryPostProcessor, BeanPostProcessor, BeanNameAware {


	public Person() {
		System.out.println("constructor......");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessor#postProcessBeanFactory");
	}

	public void init() {
		System.out.println("init ... ");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor.before " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor.after " + beanName);
		return bean;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware.setBeanName" + name);
	}
}
