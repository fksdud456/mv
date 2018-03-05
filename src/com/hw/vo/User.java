package com.hw.vo;

public class User {
	private String id;
	private String pwd;
	private String name;
	public User() {
	}
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User temp = (User) obj;
			if((this.id).equals(temp.id) &&
				(this.pwd).equals(temp.pwd) &&
				(this.name).equals(temp.name) ) {
				return true;
			}
		}
		
		return false;
	}
	@Override
	public int hashCode() {
		return (id+pwd+name).hashCode();
	}
	
	
	
}






