package cn.edu.scau.yuki.Collection.ex02;

import java.util.List;
import java.util.Scanner;

public class Service {
	
	public User query(List<User> list) {
		System.out.println("输入要查询的姓名： ");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		for(User user:list) {
			if(user.getName().equals(name)) {
				System.out.println("查询结果为： ");
				show(user);
				return user;
			}
		}
		return null;
	}
	
	public User query(List<User> list, String name) {
		for(User user:list) {
			if(user.getName().equals(name)) {
				return user;
			}
		}
		return null;
	}
	
	public boolean add(List<User> list) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入要创建联系人的姓名： ");
		String name = input.next();
		System.out.println("输入联系人的电话号码： ");
		int phoneNumber = input.nextInt();
		User user = new User(name, phoneNumber);
		list.add(user);
		System.out.println("创建成功！");
		return true;
	}
	
	
	public boolean delete(List<User> list) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入要删除联系人的姓名： ");
		String name = input.next();
		User user = query(list, name);
		if(user == null) {
			System.out.println("该联系人不存在！");
			return false;
		}
		System.out.println("删除成功！");
		return true;
	}
	
	public void show(User user) {
		System.out.println("----------------");
		System.out.println("联系人姓名： ");
		System.out.println(user.getName());
		System.out.println("联系人电话号码： ");
		System.out.println(user.getPhoneNumber());
		System.out.println("----------------");
	}
	
	public void UI() {
		System.out.println("**************");
		System.out.println("1、创建联系人");
		System.out.println("2、查询联系人");
		System.out.println("3、删除联系人");
		System.out.println("**************");
	}
}
