package tw.org.iii;

public class Iftest0311 {

	public static void main(String[] args) {
		int a=10, b = 3;
		if (--a>= 10 & b++<=3){
			System.out.println("OK:a=" +a+",b="+b);
		}else{
			System.out.println("XX:a=" +a+",b="+b);
	}
	}
}