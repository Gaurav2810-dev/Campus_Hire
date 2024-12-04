package com.jbk.entities;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="user")
public class user {
	@Id
	@Column(name="username",nullable=false,unique = true)
	@NotBlank(message="invalid Uername")
	private String username;
	@Column(name="password",nullable=false)
	@Pattern(
	        regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
	        message = "Invalid password: must contain at least one uppercase letter, one lowercase letter, one digit, one special character, and be at least 8 characters long."
	    )
	private String password;
	
	@Column(name="question",nullable=false)
	@NotBlank(message="invalid question")
	private String question;
	@Column(name="answer",nullable=false)
	@NotBlank(message="invalid answer")
	private String answer;
	@Column(name="role",nullable=false)
	@NotBlank(message="invalid role")
	private String role;
	
	
	
	public user() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public user(String username, String password, String question, String answer, String role) {
		super();
		this.username = username;
		this.password = password;
		this.question = question;
		this.answer = answer;
		this.role = role;
	}
	
	

}
