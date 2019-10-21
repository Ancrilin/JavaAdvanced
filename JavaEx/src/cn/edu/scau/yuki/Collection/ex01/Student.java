package cn.edu.scau.yuki.Collection.ex01;

public class Student {
	private String name;
	private int id;
	private int age;
	private double Chinese;
	private double math;
	private double English;
	
	public Student(int id, String name, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void SetAchievement(double Chinese, double math, double English) {
		this.Chinese = Chinese;
		this.math = math;
		this.English = English;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getid() {
		return this.id;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getChinese() {
		return this.Chinese;
	}
	
	public double getMath() {
		return this.math;
	}
	
	public double getEnglish() {
		return this.English;
	}
}
