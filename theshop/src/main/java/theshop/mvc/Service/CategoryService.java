package theshop.mvc.Service;

import java.util.List;

import theshop.mvc.model.Category;

public interface CategoryService {
	
	public void addCategory(Category category);
	public void removeCategory(String categoryid);
	public void updateCategory(Category category);
	public List<Category> getAllCategory();
	public Category getCategoryById(String categoryid);
	void removeCategory(Category c);

}
