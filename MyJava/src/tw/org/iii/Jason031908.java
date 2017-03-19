package tw.org.iii;

public class Jason031908 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1;
		sb1.append("12345678901234567");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println(sb1 == sb2);

	}

}
