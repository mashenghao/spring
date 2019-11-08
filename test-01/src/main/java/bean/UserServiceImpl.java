package bean;

/**
 * @author: mahao
 * @date: 2019/11/7
 */
public class UserServiceImpl implements UserService {

	@Override
	public User createUser(String firstName, String lastName, int age) {
		User user = new User();
		user.setName(firstName);
		user.setAge(age);
		return user;
	}

	@Override
	public User queryUser() {
		User user = new User();
		user.setName("test");
		user.setAge(20);
		return user;
	}
}
