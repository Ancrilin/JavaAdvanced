package work06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceive {
	public static void main(String[] args) throws Exception{
		InetAddress ip = InetAddress.getLocalHost();
		int port = 8001;
		DatagramSocket receive = new DatagramSocket(port, ip);
		byte [] buf = new byte[1024];
		DatagramPacket getPacket = new DatagramPacket(buf, buf.length);
		receive.receive(getPacket);
		String getMes = new String(buf, 0, getPacket.getLength());
//		System.out.println("----");
		System.out.println(getMes);
	}
}
