package tw.org.iii;

public class Jason032502 {
	public static void main(String[] args) {
	int a= 10, b= 3;
	int[] c ={1,2,3,4};
	try{
	System.out.println(a/b);
	System.out.println(c[4]);
//	}catch(ArrayIndexOutOfBoundsException ee){
//		System.out.println(("XX"));
	}catch(ArithmeticException ae){
		System.out.println("87");
	}catch(RuntimeException re){
		System.out.println("OK");
	}
	System.out.println("Hello,World");
	}

}
