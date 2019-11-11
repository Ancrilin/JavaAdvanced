package cn.edu.scau.yuki.NetWork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DatagramSocket server = new DatagramSocket(9000);//监听端口
		String str = "www.mldn.cn";
		DatagramPacket packet = new DatagramPacket(str.getBytes(),0,str.length(),InetAddress.getByName("localhost"),9999);
		server.send(packet);
		System.out.println("消息发送完毕");
		server.close();
	}

}
