package theshop.mvc.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import theshop.mvc.model.Authorisation;
import theshop.mvc.model.User;


@Repository
public class UserDAOImpl implements UserDAO {

private	SessionFactory sessionFactory; 

	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("DAO");
		Session sess=sessionFactory.getCurrentSession();
		sess.persist(user);
		user.setActive(true);
		Authorisation auth = new Authorisation();
		auth.setRole("ROLE_USER");
		auth.setEmail(user.getUemail());
		sess.persist(user);
		sess.persist(auth);
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	

}
