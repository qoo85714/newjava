package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Jason040817 {

	public static void main(String[] args) {
		try {
			URL url =new URL("https://farm6.staticflickr.com/5710/20595559683_6be33a4f16_c.jpg");
			URLConnection conn =url.openConnection();
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[4096];int len;
			while ((len = bin.read(buf)) != -1){
				bout.write(buf,0,len);
			}
			bin.close();
			bout.flush();
			bout.close();
			
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
		

	}

}
