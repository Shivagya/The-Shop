package theshop.mvc.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import theshop.mvc.DAO.CategoryDAO;
import theshop.mvc.model.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	CategoryDAO categoryDAO;

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	public void addCategory(Category category) {
		categoryDAO.addCategory(category);
		
	}

	public void removeCategory(String categoryid) {
		categoryDAO.removeCategory(categoryid);
		
	}

	public void updateCategory(Category category) {
		categoryDAO.updateCategory(category);
		
	}

	public List<Category> getAllCategory() {
		return categoryDAO.getAllCategory();
		
	}

	public Category getCategoryById(String categoryid) {
		return	categoryDAO.getCategoryById(categoryid);
	
	}

	public void removeCategory(Category c) {
		categoryDAO.removeCategory(c);
		
	}
	
	

}
