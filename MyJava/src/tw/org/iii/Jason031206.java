package tw.org.iii;

public class Jason031206 {

	public static void main(String[] args) {
		String a = new String("abc");
		String b = new String("abc");
		String c = "abc";
		String d = "abc";		
		/* == 比較是否相同物件
		 * equal 比較物件內容
		 */
		System.out.println(a == b);//false
		System.out.println(c == d);//true
		System.out.println(a.equals(b));//true 
	}

}
