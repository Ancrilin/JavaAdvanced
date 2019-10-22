package cn.edu.scau.yuki.Collection.ex02;

public class User {
	private String name;
	private int phoneNumber;
	
	public User(String name, int phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
}
