package theshop.mvc.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import theshop.mvc.model.Category;
import theshop.mvc.model.Product;


@Repository
public class CategoryDAOImpl implements CategoryDAO {
	
	private	SessionFactory sessionFactory;//sessionFactory is an Interface so can't create object. That's why create setter.
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void addCategory(Category category) {
		Session s = sessionFactory.getCurrentSession();
		category.setCategory_id(category.getCategory_name());
		s.persist(category);
		
	}


	public void removeCategory(String categoryid) {
		removeCategory(getCategoryById(categoryid));
				
	}


	public void updateCategory(Category category) {
		sessionFactory.getCurrentSession().update(category);
		
	}


	public List<Category> getAllCategory() {
		Session session=this.sessionFactory.getCurrentSession();
		List<Category>categoryList=(List<Category>)session.createQuery("from Category").list();
		for(Category p:categoryList)
		  System.out.println(p.getCategory_id());
		return categoryList;
	}


	public Category getCategoryById(String categoryid) {
		return (Category)this.sessionFactory.getCurrentSession().get(Category.class, categoryid);
	}


	public void removeCategory(Category c) {
		this.sessionFactory.getCurrentSession().delete(c);
		
	}

		
	

}
