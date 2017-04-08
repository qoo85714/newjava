package tw.org.iii;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Jason040804 {

	public static void main(String[] args) {
		try {
			DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat"));
			String c = din.readUTF();
			String s1 =din.readUTF();
			int a =din.readInt();
			int b =din.readInt();			
			char c1 = din.readChar();
			din.close();
			System.out.println("=>"+ a + ":"+ b + ":"+ c + ":" + s1);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
