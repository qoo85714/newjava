package tw.org.iii;
public class Jason031909 {
	public static void main(String[] args) {
		Jason421 b1 = new Jason422();
		//b1.m1();
		Jason422 b2 = (Jason422)b1;
		//b2.m1();
		Jason421 b3 = new Jason423();
		//Jason422 b4 = (Jason422)b3;
		
	}
}
class Jason421{
	void m1(){System.out.println("Jason421:m1()");}
}
class Jason422 extends Jason421{
	void m1(){System.out.println("Jason422:m1()");}
	void m2(){System.out.println("Jason422:m2()");}
}
class Jason423 extends Jason421{
	void m1(){System.out.println("Jason423:m1()");}
	void m2(){System.out.println("Jason423:m2()");}
}
