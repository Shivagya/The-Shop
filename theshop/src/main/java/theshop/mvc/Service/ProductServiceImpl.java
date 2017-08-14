package theshop.mvc.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import theshop.mvc.DAO.ProductDAO;
import theshop.mvc.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductDAO productDAO;
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	@Transactional
	public void addProduct(Product product) {
		productDAO.addProduct(product);
		
	}

	@Transactional
	public void deleteProduct(int pid) {
		productDAO.deleteProduct(pid);
		
	}

	@Transactional
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);
		
	}
	@Transactional
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDAO.getAllProduct();
	}
	
	@Transactional
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDAO.getProductById(id);
	}

	
}
