package cn.edu.scau.yuki.Collection.ex01;

import java.util.List;

public class Utils {
	public boolean add(List<Student> students, Student student) {
		return students.add(student);
	}
	
	public boolean insert(List<Student> students, Student student, int index) {
		students.add(index, student);
		return true;
	}
	
	public boolean get(List<Student> students, int index) {
		students.get(index);
		return true;
	}
}
