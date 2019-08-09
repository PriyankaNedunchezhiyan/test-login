package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_login")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY ) 
	private Long id;
	@Column
	private String username;
	@Column
	private String password;
	
	@Column
	private String conformpassword;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getConformpassword() {
		return conformpassword;
	}

	public void setConformpassword(String conformpassword) {
		this.conformpassword = conformpassword;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", username=" + username + ", password=" + password + ", conformpassword="
				+ conformpassword + "]";
	}

	public User( String username, String password) {
		super();
		
		this.username = username;
		this.password = password;
		
	}
	
	
	public User(){
	
	}
	

}
