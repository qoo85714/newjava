package tw.org.iii;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Jason040813 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("10.1.6.65"),9999);
			OutputStream out = socket.getOutputStream();
			out.write("Hello,World".getBytes());
			out.flush();
			socket.close();
		} catch (Exception e) {
			System.out.println();

		}

	}

}
