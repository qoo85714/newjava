package tw.org.iii;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Jason040810 {

	public static void main(String[] args) {
		
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net");
			for(InetAddress ip : ips){
			System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		}

	}

}
