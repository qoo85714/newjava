package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jason032506 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try{
		FileInputStream fin =
				new FileInputStream(file);
		//int data = fin.read();
		int temp;
		while ((temp = fin.read()) !=-1){
			System.out.print((char)temp);
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
