package com.hw.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

// t_product
public class Product {
	int id;
	String name;
	int price;
	Date regdate;
	String imgname;
	MultipartFile mf;
	public Product() {
	}
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product(int id, String name, int price, String imgname) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}
	public Product(int id, String name, int price, Date regdate, String imgname) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.regdate = regdate;
		this.imgname = imgname;
	}
	
	public MultipartFile getMf() {
		return mf;
	}
	public void setMf(MultipartFile mf) {
		this.mf = mf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", regdate=" + regdate + ", imgname="
				+ imgname + "]";
	}
	
	
}


