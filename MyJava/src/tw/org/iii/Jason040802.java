package tw.org.iii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Jason040802 {

	public static void main(String[] args) {
		String data ="Hello,Brad\nLine1\nLine2";
		File outFile = new File("./dir1/brad.txt");
		try {
			FileOutputStream fout = new FileOutputStream(outFile);
			fout.write(data.getBytes());
			fout.flush();
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
