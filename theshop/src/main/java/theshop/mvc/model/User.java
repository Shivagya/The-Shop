package theshop.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
	
	@NotEmpty(message="Enter your name, Name should be specified.")
	private String uname;
	
	//@Size(min=10,max=10,message="Enter an appropriate phone number.")
	private long uphone;
	
	@NotEmpty(message="Enter your email, Email should be specified.")
	private String uemail;
	
	@Length(min=8,max=20, message="Password should be atleast 8 character long.")
	private String upass;
	
	public boolean isActive;
	
	//@Size(min=2, max=3, message="Maximum age should be 100.")
	private int age;

	@NotEmpty(message="Specify your gender.")
	private String sex;
	
	
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public long getUphone() {
		return uphone;
	}

	public void setUphone(long uphone) {
		this.uphone = uphone;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}	
	
	
	
	
}
