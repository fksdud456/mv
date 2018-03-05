package com.hw.vo;

import org.springframework.web.multipart.MultipartFile;

public class Item {
	int id;
	String name;
	int price;
	String cate;
	String img;
	MultipartFile imgfile;
	public Item() {
	}
	public Item(int id, String name, int price, String cate, String img,
			MultipartFile imgfile) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.cate = cate;
		this.img = img;
		this.imgfile = imgfile;
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
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public MultipartFile getImgfile() {
		return imgfile;
	}
	public void setImgfile(MultipartFile imgfile) {
		this.imgfile = imgfile;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price
				+ ", cate=" + cate + ", img=" + img + ", imgfile=" + imgfile
				+ "]";
	}
	
	
}






