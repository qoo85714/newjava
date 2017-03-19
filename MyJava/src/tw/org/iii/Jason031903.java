package tw.org.iii;
public class Jason031903 {
	public static void main(String[] args) {
		Jason271 b1 = new Jason272();
		Jason271 b2 = new Jason273();
		b1.m2();
		b2.m2();
	}
}
abstract class Jason271 {
	Jason271(){System.out.println("Jason271()");}
	void m1(){System.out.println("Jason271():m1");}
	abstract void m2();
	
}
class Jason272 extends Jason271 {
	void m2(){System.out.println("Jason272():m2");}
}
class Jason273 extends Jason271 {
	void m2(){System.out.println("Jason273():m2");}
}
abstract class Jason274 extends Jason271 {
	void m3(){}
	abstract void m4();	
}
abstract class Jason275{
	void m1(){}
}
