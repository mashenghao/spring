package bean;

/**
 * 属性注入的方式有两种：
 * 1. 构造方法的注入
 * 2. set方法的注入
 *
 * @author: mahao
 * @date: 2019/10/28
 */
public class User {

	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
