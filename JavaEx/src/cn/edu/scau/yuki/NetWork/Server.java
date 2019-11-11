package cn.edu.scau.yuki.NetWork;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9999);
		while(true) {
			Socket socket = server.accept();
			SocketHandler handler = new SocketHandler(socket);
			Thread thread = new Thread(handler);
			thread.start();
		}
	}

}
