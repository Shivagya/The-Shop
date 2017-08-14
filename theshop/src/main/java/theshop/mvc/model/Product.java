package theshop.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	
	
//	@Min
//	@Max
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	
	@NotEmpty(message="Name should be specified")
	private String pname;
	
	//@Size(min=1, max=10, message="size of the price should be between 1 & 10 ")
	private	int pprice;
	
	@NotEmpty(message="Category should be specified")
	private String pcategoryid;
	
	@ManyToOne
	@JoinColumn(name="pcategoryid",insertable=false,updatable=false,nullable=false)//gets a Set from Category model and joins it with pcategoryid
	private Category category;//this obj used in Category model
	
	//@Size(min=1, max=10, message="size of the Quantity should be between 1 & 10 ")
	private int pquantity;
	
	@Transient
	private MultipartFile image;
	
	
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public int getPid() {
		return pid;
	}
	public String getPcategoryid() {
		return pcategoryid;
	}
	public void setPcategoryid(String pcategoryid) {
		this.pcategoryid = pcategoryid;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	
	
	
	
}
