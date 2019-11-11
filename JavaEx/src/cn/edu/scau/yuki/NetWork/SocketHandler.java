package cn.edu.scau.yuki.NetWork;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketHandler implements Runnable{
	private Socket socket;
	public SocketHandler(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			Scanner scan = new Scanner(socket.getInputStream());//客户端输入流
			scan.useDelimiter("\n");
			PrintStream out = new PrintStream(socket.getOutputStream());
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
//						out.print("【echo】"+val);
						out.println("【echo】"+val);
//						out.print("【echo】"+val+"\n");
//						out.flush();
					}
				}
			}
			scan.close();
			out.close();
			socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
