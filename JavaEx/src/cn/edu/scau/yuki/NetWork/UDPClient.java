package cn.edu.scau.yuki.NetWork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DatagramSocket client = new DatagramSocket(9999);//接收方指明监听端口
		byte data[] = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("客户端等待接受发送的信息...");
		client.receive(packet);//接受消息内容
		System.out.println("接受到的消息内容为："+new String(data,0,packet.getLength()));
		client.close();
	}

}
