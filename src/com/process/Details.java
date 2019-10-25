package com.process;
import java.util.*;

import org.bson.Document;

import com.mongodb.BasicDBObject;

public class Details extends BasicDBObject {
	private String category;
	private String title;
	private String city;
	private String postal;
	private String desc;
	private String email;
	private String phone;
	public Details(String category, String title, String city, String postal, String desc, String email, String phone) {
		this.put("category",category);
		this.put("title",title);
		this.put("city",city);
		this.put("postal",postal);
		this.put("desc",desc);
		this.put("email",email);
		this.put("phone",phone);
	}
	public Details(Document d) {
		this.put("category",(String) d.getString("category"));
		this.put("title",(String) d.getString("title"));
		this.put("city",(String) d.getString("city"));
		this.put("postal",(String) d.getString("postal"));
		this.put("desc",(String) d.getString("desc"));
		this.put("email",(String) d.getString("email"));
		this.put("phone",(String) d.getString("phone"));
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
