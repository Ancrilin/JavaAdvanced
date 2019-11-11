package cn.edu.scau.yuki.NetWork;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9999);//TCP
		System.out.println("等待客户端连接...");
		Socket client = server.accept();
		//接受客户端消息
		Scanner scan = new Scanner(client.getInputStream());//客户端输入流
		scan.useDelimiter("\n");
		PrintStream out = new PrintStream(client.getOutputStream());
		boolean flag = true;
		while(flag) {
			if(scan.hasNext()) {
				String val = scan.next().trim();
				System.out.println(val);
				if("byebye".equalsIgnoreCase(val)) {
					System.out.println(val);
					out.println("ByeByeBye...");
					flag = false;
				}
				else {
//					out.print("【echo】"+val);
					out.println("【echo】"+val);
//					out.print("【echo】"+val+"\n");
//					out.flush();
				}
			}
		}
		scan.close();
		out.close();
		client.close();
		server.close();
	}

}
