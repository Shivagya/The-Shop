package theshop.mvc.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import theshop.mvc.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
private	SessionFactory sessionFactory;//sessionFactory is an Interface so can't create object. That's why create setter.
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
	public void addProduct(Product product) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(product);
		
	}
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		Product p=(Product)session.load(Product.class,new Integer(pid));
        session.delete(p);
        System.out.println("data deleted successfully="+p);
		
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		/*Session session=this.*/sessionFactory.getCurrentSession().update(product);
        System.out.println("data updated successfully="+product);
		
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		List<Product> l = (List<Product>)s.createQuery("from Product").list();//List<Product>s.createQuery.....(it is typecasting)
		return l;
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		Product p=(Product) session.get(Product.class,new Integer(id));
		System.out.println("data of product by id="+p);
		return p;
	}

	


}
