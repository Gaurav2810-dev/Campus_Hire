package com.jbk.entities;




import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class student {
    @Id
    @Column(name="id",nullable = false,unique = true)
	private long id;
    
    @Column(name="Fullname",nullable = false)
    @JsonProperty("fullname")
	private String fullname;
    
    @Column(name="email",nullable = false,unique = true)
	private String email;
    
    @Column(name="password",nullable=false)
	private String password;
    
    @Column(name="ContactNo ",nullable = false,unique = true)
	private int ContactNo;
    
    @Column(name="department ",nullable = false)
	private String department;
    
    @Column(name="graduration_year ",nullable = false)
	private String graduration_year;
    
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setfullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getContactNo() {
		return ContactNo;
	}

	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGraduration_year() {
		return graduration_year;
	}

	public void setGraduration_year(String graduration_year) {
		this.graduration_year = graduration_year;
	}

	public student(long id, String fullname, String email, String password, int contactNo, String department,
			String graduration_year) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.ContactNo = contactNo;
		this.department = department;
		this.graduration_year = graduration_year;
	}
	
	
}
