package bean;

/**
 * @author: mahao
 * @date: 2019/11/7
 */
public interface UserService {

	User createUser(String firstName, String lastName, int age);

	User queryUser();
}
