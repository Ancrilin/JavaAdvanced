package cn.edu.scau.yuki.Collection.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		Service service = new Service();
		List<User> list = new ArrayList<User>();
		while(flag) {
			service.UI();
			int select = input.nextInt();
			switch(select) {
			case 1:service.add(list);break;
			case 2:service.query(list);break;
			case 3:service.delete(list);break;
			}
			System.out.println("是否继续");
			System.out.println("是 则输入 1");
			System.out.println("否 则输入 0");
			int end = input.nextInt();
			if(end == 0)
				flag = false;
		}
	}

}
