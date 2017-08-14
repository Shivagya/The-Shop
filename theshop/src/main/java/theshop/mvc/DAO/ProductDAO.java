package theshop.mvc.DAO;

import java.util.List;

import theshop.mvc.model.Product;

public interface ProductDAO {
	
	public void addProduct(Product product);
	public void deleteProduct(int pid);
	public void updateProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(int id);

}
