package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Jason040816 {

	public static void main(String[] args) {
		ServerSocket server;
		try {
			server = new ServerSocket (9999);
			Socket socket = server.accept();
			
			System.out.println(socket.getInetAddress().getHostAddress());
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[4096];int len;
			while ((len = bin.read(buf)) != -1){
				bout.write(buf,0,len);
			}
		
			bin.close();
			bout.flush();
			bout.close();
			System.out.println("Receive OK");
			
			
			server.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		

	}

}
