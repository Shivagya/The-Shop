package theshop.mvc.DAO;

import java.util.List;

import theshop.mvc.model.Category;

public interface CategoryDAO {
	
	public void addCategory(Category category);
	public void removeCategory(String categoryid);
	public void updateCategory(Category category);
	public List<Category> getAllCategory();
	public Category getCategoryById(String categoryid);
	void removeCategory(Category c);

}
