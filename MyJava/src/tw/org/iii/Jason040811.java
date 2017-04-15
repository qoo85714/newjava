package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Jason040811 {

	public static void main(String[] args) {
		// UDP /TCP
		String data = "Hello,Brad";
		byte[] sendData = data.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length,
					InetAddress.getByName("10.2.24.149"),4567);
			socket.send(packet);
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}