package cn.edu.scau.yuki.Collection.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Service service = new Service();
		boolean flag = true;
		List<Student> students =  new ArrayList<Student>();
		Student stu;
		int id;
		while(true) {
			service.UI();
			int select = input.nextInt();
			switch(select) {
//			case 0:flag = false;break;
			case 1:service.newStudent(students);break;
			case 2:System.out.println("输入查询的学生id： ");id = input.nextInt();stu = service.query(students, id);
					System.out.println("查询结果：");
					if(stu == null) {
						System.out.println("不存在该学生id！");
						break;
					}service.show(stu);break;
			case 3:System.out.println("输入删除的学生id： ");id = input.nextInt();service.delete(students, id);break;
			case 4:id = input.nextInt();service.modify(id, students);break;
			}
			System.out.println("是否继续");
			System.out.println("是 则输入 1");
			System.out.println("否 则输入 0");
			int cont = input.nextInt();
		}
	}

}
