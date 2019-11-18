package work02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
	List<Student> students = new ArrayList<Student>();
	Scanner input = new Scanner(System.in);
	
	public Management() {
		Menu();
	}
	
	private void UI() {
		System.out.println("=================");
		System.out.println("1、添加学生");
		System.out.println("2、查询学生");
		System.out.println("3、删除学生");
		System.out.println("4、遍历学生");
		System.out.println("5、查询平均成绩");
		System.out.println("6、查询最高分和最低分");
		System.out.println("0、退出");
	}
	
	public void Menu() {
		boolean flag = true;
		while(flag) {
			UI();
			int select = input.nextInt();
			switch(select) {
			case 1:addStudent();break;
			case 2:queryStudent();break;
			case 3:deleteStudent();break;
			case 4:listStudent();break;
			case 5:averageScore();break;
			case 6:getMaxAndMinScore();break;
			case 0:flag = false;break;
			}
		}
	}

	
	private void addStudent() {
		System.out.println("输入添加学生的id");
		int id = input.nextInt();
		System.out.println("输入添加学生的name");
		String name = input.next();
		System.out.println("输入添加学生的sex");
		String sex = input.next();
		System.out.println("输入添加学生的grade");
		int grade = input.nextInt();
		System.out.println("输入添加学生的Chinese");
		double Chinese = input.nextDouble();
		System.out.println("输入添加学生的Math");
		double Math = input.nextDouble();
		System.out.println("输入添加学生的English");
		double English = input.nextDouble();
		Student student = new Student(id, name, sex, grade, Chinese, Math, English);
		students.add(student);
	}
	
	private void queryStudent() {
		System.out.println("输入查询学生的id");
		int id = input.nextInt();
		Student student = null;
		for(Student stu: students) {
			if(stu.getId() == id) {
				student = stu;
			}
		}
		if(student == null) {
			System.out.println("找不到该学生");
		}else {
			System.out.println("-----------------");
			System.out.println("该学生为：");
			student.show();
		}
	}
	
	private void deleteStudent() {
		System.out.println("输入删除学生的id");
		int id = input.nextInt();
		Student student = null;
		for(Student stu :students) {
			if(stu.getId() == id) {
				student = stu;
			}
		}
		if(student == null) {
			System.out.println("找不到该学生");
		}else {
			students.remove(student);
			System.out.println("删除成功");
		}
	}
	
	private void listStudent() {
		for(Student stu :students) {
			stu.show();
		}
	}
	
	private void averageScore() {
		double avg_Chinese = 0;
		double avg_Math = 0;
		double avg_English = 0;
		for(Student stu :students) {
			avg_Chinese += stu.getChinese().getScore();
			avg_Math += stu.getMath().getScore();
			avg_English += stu.getEnglish().getScore();
		}
		avg_Chinese /= students.size();
		avg_Math /= students.size();
		avg_English /= students.size();
		System.out.println("--------------");
		System.out.println("avg_Chinese: " + avg_Chinese);
		System.out.println("avg_Math: " + avg_Math);
		System.out.println("avg_English: " + avg_English);
	}
	
	private void getMaxAndMinScore() {
		System.out.println("1、Chinese");
		System.out.println("2、Math");
		System.out.println("3、English");
		int select = input.nextInt();
		switch(select) {
		case 1:maxminChinese();break;
		case 2:maxminMath();break;
		case 3:maxminEnglish();break;
		}
	}
	
	private void maxminChinese() {
		double max_Chinese = Double.NEGATIVE_INFINITY;
		double min_Chinese = Double.POSITIVE_INFINITY;
		for(Student stu : students) {
			if(stu.getChinese().getScore() > max_Chinese)
				max_Chinese = stu.getChinese().getScore();
			if(stu.getChinese().getScore() < min_Chinese)
				min_Chinese = stu.getChinese().getScore();
		}
		System.out.println("Max Chinese Score: " + max_Chinese);
		System.out.println("Min Chinese Score: " + min_Chinese);
	}
	
	private void maxminMath() {
		double max_Math = Double.NEGATIVE_INFINITY;
		double min_Math = Double.POSITIVE_INFINITY;
		for(Student stu : students) {
			if(stu.getMath().getScore() > max_Math)
				max_Math = stu.getChinese().getScore();
			if(stu.getMath().getScore() < min_Math)
				min_Math = stu.getChinese().getScore();
		}
		System.out.println("Max Math Score: " + max_Math);
		System.out.println("Min Math Score: " + min_Math);
	}

	private void maxminEnglish() {
		double max_English = Double.NEGATIVE_INFINITY;
		double min_English = Double.POSITIVE_INFINITY;
		for(Student stu : students) {
			if(stu.getEnglish().getScore() > max_English)
				max_English = stu.getChinese().getScore();
			if(stu.getChinese().getScore() < min_English)
				min_English = stu.getChinese().getScore();
		}
		System.out.println("Max English Score: " + max_English);
		System.out.println("Min English Score: " + min_English);
	}
}
