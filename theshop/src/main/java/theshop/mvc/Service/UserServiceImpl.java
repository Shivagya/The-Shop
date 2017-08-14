package theshop.mvc.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import theshop.mvc.DAO.UserDAO;
import theshop.mvc.model.User;

@Service
public class UserServiceImpl implements UserService {

private	UserDAO userDAO;//It is the object of interface. Create setter.

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Transactional
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Service");
		userDAO.addUser(user);
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(user);
		
	}
	

	

}
