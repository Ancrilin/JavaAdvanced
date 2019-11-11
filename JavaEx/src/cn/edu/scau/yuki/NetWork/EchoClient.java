package cn.edu.scau.yuki.NetWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	private static final BufferedReader KEYBOARD_INPUT = new BufferedReader(new InputStreamReader(System.in));
	public static String getString(String prompt) throws Exception{
		System.out.println(prompt);
		String str = KEYBOARD_INPUT.readLine();
		return str;
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket client = new Socket("localhost", 9999);
		Scanner scan = new Scanner(client.getInputStream());
		scan.useDelimiter("\n");
		PrintStream out = new PrintStream(client.getOutputStream());
		boolean flag = true;
		while(flag) {
			String input = getString("输入要发送的内容：").trim();
			out.println(input);
			if(scan.hasNext()) {
				if(scan.hasNext())
					System.out.println("true");
				String val = scan.next();
				System.out.println(val);
			}
			if("byebye".equalsIgnoreCase(input)) {
				flag = false;
			}
		}
		scan.close();
		out.close();
		client.close();
	}

}
