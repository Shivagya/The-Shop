package theshop.mvc.Service;

import theshop.mvc.DAO.UserDAO;
import theshop.mvc.model.User;

public interface UserService {
	
	public void addUser(User u);
	public void deleteUser(User u);

}
