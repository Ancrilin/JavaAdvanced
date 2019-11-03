package cn.edu.scau.yuki.Collection.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		boolean flag = true;
//		Service service = new Service();
//		List<User> list = new ArrayList<User>();
//		while(flag) {
//			service.UI();
//			int select = input.nextInt();
//			switch(select) {
//			case 1:service.add(list);break;
//			case 2:service.query(list);break;
//			case 3:service.delete(list);break;
//			}
//			System.out.println("是否继续");
//			System.out.println("是 则输入 1");
//			System.out.println("否 则输入 0");
//			int end = input.nextInt();
//			if(end == 0)
//				flag = false;
//		}
		List<User> all = new ArrayList<User>();
		Service service = new Service();
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int select;
		while(flag) {
			service.UI();
			select = input.nextInt();
			switch(select) {
			case 1:service.add(all);
			case 2:service.query(all);
			case 3:service.delete(all);
			default:flag = false;
			}
		}
	}

}
