package work06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost", 8002);
		Scanner scan = new Scanner(socket.getInputStream());
		if(scan.hasNext()) {
			String val = scan.next();
			System.out.println(val);
		}
		scan.close();
		socket.close();
	}
}
