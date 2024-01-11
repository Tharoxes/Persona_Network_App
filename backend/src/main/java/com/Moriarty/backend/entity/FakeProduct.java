//package com.Moriarty.backend.entity;
//
//import java.util.UUID;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="fake_product")
//public class FakeProduct {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.UUID)
//	@Column(name="fake_Product_uuid")
//	private UUID fakeProduct_uuid;
//	
//	@Column(name="title")
//	private String title;
//	
//	public FakeProduct() {
//		
//	}
//
//	public FakeProduct(String title) {
//		super();
//		this.title = title;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public UUID getFakeProduct_uuid() {
//		return fakeProduct_uuid;
//	}
//
//	public void setFakeProduct_uuid(UUID fakeProduct_uuid) {
//		this.fakeProduct_uuid = fakeProduct_uuid;
//	}
//	
//	
//
//}
