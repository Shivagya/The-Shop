package theshop.mvc.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Category {
	
	@Id
	String category_id;
	
	@Column(unique=true)
	@NotEmpty(message="Field should be specified")
	String category_name;
	
	@NotEmpty(message="Field should be specified")
	String category_desc;
	
	@OneToMany(mappedBy="category", fetch=FetchType.EAGER)//category obj created in product model to join columns
	private Set<Product>products; 
	

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_desc() {
		return category_desc;
	}

	public void setCategory_desc(String category_desc) {
		this.category_desc = category_desc;
	}
	

}
