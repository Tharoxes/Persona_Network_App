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
//@Entity
//@Table(name="users")
//public class User {
//	
//	// unique identifier, contact, recovery
//	@Id
//	@GeneratedValue(strategy = GenerationType.UUID)
//	@Column(name="user_uuid", columnDefinition="BINARY(16)", length=16)
//	private UUID uuid;
//	
//	@Column(name="user_name")
//	private String username;
//	
//	@Column(name="email")
//	private String email;
//	
//	@Column(name="password")
//	private String password;
//	
//	
//	public User() {
//		
//	}
//	
//	public User(String username, String email, String password) {
//		this.username = username;
//		this.email = email;
//		this.password = password;
//	}
//	
//	public UUID getId() {
//		return uuid;
//	}
//	public void setId(UUID uuid) {
//		this.uuid = uuid;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	
//
//}
