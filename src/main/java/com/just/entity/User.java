package com.just.entity;

public class User {
	private int uId;
	private String uName;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + "]";
	}
	
}
