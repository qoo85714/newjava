package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Jason040809 {
	public static void main(String[] args) {
		Brad613 obj = new Brad613();
		//序列化
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/Brad611"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("---------");
		// 解序
		try{
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/Brad611"));
			Brad613 obj2 = (Brad613)oin.readObject();
			oin.close();
			
		}catch(Exception ee){
			
		}
	}

}
class Brad611 implements Serializable {
	Brad611(){System.out.println("Brad611()");}
}
class Brad612 extends Brad611  {
	Brad612(){System.out.println("Brad612()");}
}
class Brad613 extends Brad612 {
	Brad613(){System.out.println("Brad613()");}
}