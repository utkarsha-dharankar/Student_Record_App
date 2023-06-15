package org.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="student_info")
public class Student {

	@Id
	private long id;
	
	@Column(nullable = false)
	@Size(max = 20, min=1,message = "student name must be 1 to 20 charcters long.")
	private String name;
	
	
	@Column(nullable = false)
	@Size(max = 20, min=2,message = "student email must be 2 to 20 charcters long.")
	private String email;
	
	@NotNull(message = "address can not be empty")
	@Size(max = 20, min=1,message = "student address must be 1 to 20 charcters long.")
	private String address;

	public Student() {
	
	}

	public Student(long id, String name,String email,String address) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
	
	
}
