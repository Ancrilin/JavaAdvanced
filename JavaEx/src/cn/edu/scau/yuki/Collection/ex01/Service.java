package cn.edu.scau.yuki.Collection.ex01;

import java.util.List;
import java.util.Scanner;

public class Service {
	public boolean add(List<Student> students, Student student) {
		return students.add(student);
	}
	
	public boolean insert(List<Student> students, Student student, int index) {
		students.add(index, student);
		System.out.println("插入成功！");
		return true;
	}
	
	public boolean get(List<Student> students, int index) {
		students.get(index);
		return true;
	}
	
	public boolean delete(List<Student> students, int index) {
		students.remove(index);
		System.out.println("删除成功！");
		return true;
	}
	public void newStudent(List<Student> students) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入学生id：");
		int nid = input.nextInt();
		System.out.println("输入学生姓名：");
		String name = input.next();
		System.out.println("输入学生年龄：");
		int nage = input.nextInt();
		Student student = new Student(nid, name, nage);
		System.out.println("输入Chinese成绩：");
		double Chinese = input.nextDouble();
		System.out.println("输入math成绩： ");
		double math = input.nextDouble();
		System.out.println("输入English成绩：");
		double English = input.nextDouble();
		student.SetAchievement(Chinese, math, English);
		students.add(student);
		System.out.println("创建学生成功！");
	}
	
	public boolean modify(int id, List<Student> students) {
		Student stu = query(students, id);
		System.out.println("原学生信息：");
		show(stu);
		int index = students.indexOf(stu);
		System.out.println("输入修改后的学生成绩信息：");
		Scanner input = new Scanner(System.in);
		Student newS = new Student(id, stu.getName(), stu.getAge());
		System.out.print("Chinese: ");
		System.out.print("math： ");
		System.out.print("English: ");
		double Chinese = input.nextDouble();
		double math = input.nextDouble();
		double English = input.nextDouble();
		newS.SetAchievement(Chinese, math, English);
		students.set(index, newS);
		System.out.println("修改成功！");
		return true;
	}
	
	public Student query(List<Student> students, int id) {
		for(Student stu: students) {
			if(stu.getid() == id) {
				return stu;
			}
		}
		return null;
	}
	
	public void show(Student student) {
		System.out.println("*********************");
		System.out.println("id: "+student.getid());
		System.out.println("name： "+student.getName());
		System.out.println("age：  "+student.getAge());
		System.out.println("Chinese： "+student.getChinese());
		System.out.println("math： "+student.getMath());
		System.out.println("English："+student.getEnglish());
		System.out.println("*********************");
	}
	
	public void UI() {
		System.out.println("-----------------------");
		System.out.println("学生信息管理系统");
		System.out.println("1、创建新的学生");
		System.out.println("2、查询学生信息");
		System.out.println("3、删除学生信息");
		System.out.println("4、修改学生信息");
		System.out.println("0、退出！");
		System.out.println("-----------------------");
	}
}
