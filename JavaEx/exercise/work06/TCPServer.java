package work06;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(8002);//TCP
		System.out.println("等待客户端连接...");
		Socket client = server.accept();
		System.out.println("连接成功！");
		PrintStream out = new PrintStream(client.getOutputStream());
		out.println("HelloWorld!");
		out.close();
		client.close();
		server.close();
	}
}
