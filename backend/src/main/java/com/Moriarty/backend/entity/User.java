//package com.Moriarty.backend.entity;
//
//import java.util.UUID;
//
//import org.springframework.data.annotation.Id;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Table;
//
//
//// deprecated: for login spring security package handles the background work
//// use the entity for something else (Are User and Account the same entities? -> User_Details)
//
//@Entity
//@Table(name="users")
//public class User {
//	
//	@Id
//	@Column(name="username")
//	private String username;
//	
//	@Column(name="password")
//	private String password;
//	
//	@Column(name="emabled")
//	private int enabled;
//	
//	
//	public User() {
//		
//	}
//	
//	public User(String username, String password, int enabled) {
//		this.username = username;
//		this.password = password;
//		this.enabled = enabled;
//	}
//	
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public int getEnabled() {
//		return enabled;
//	}
//	public void setEnabled(int enabled) {
//		this.enabled = enabled;
//	}
//
//}
