package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jason032507 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try{
		FileInputStream fin =
				new FileInputStream(file);
		byte[] buf = new byte[3];
		int len;
		while ((len = fin.read(buf)) !=-1){
			System.out.print(new String (buf,0,len));
		}
//		do{
//			temp = fin.read();
//		}while(temp != -1);
		
//		System.out.print((char)fin.read());
//		System.out.print((char)fin.read());
			fin.close(); 
//		}catch(FileNotFoundException ee){
//			System.out.println(ee.toString());
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}

}
