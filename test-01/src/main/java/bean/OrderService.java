package bean;


/**
 * @program: spring
 * @Date: 2019/11/7 11:44
 * @Author: mahao
 * @Description:
 */
public interface OrderService {
	Order createOrder(String username, String product);

	Order queryOrder(String username);
}
