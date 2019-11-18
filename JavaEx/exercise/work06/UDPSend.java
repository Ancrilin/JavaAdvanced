package work06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String[] args) throws Exception{
		DatagramSocket send = new DatagramSocket();
		String mes = "HelloWorld!";
		byte [] buf = mes.getBytes();
		int port = 8001;
		InetAddress ip = InetAddress.getLocalHost();
		DatagramPacket sendPacket = new DatagramPacket(buf, buf.length, ip, port);
		send.send(sendPacket);
	}
}
