package tw.org.iii;
public class Jason032501 {
	public static void main(String[] args) {
		Jason431 obj1 = new Jason431();
		Jason431.Jason4311 obj2 = obj1.new Jason4311();
		obj2.m1();
		Jason431.m3();
		Jason431.Jason4312 obj3 = new Jason431.Jason4312();
		
	}
}
class Jason431{
	Jason431(){System.out.println("Jason431()");}
	void m1(){System.out.println("Jason431:m1()");}
	void m2(){System.out.println("Jason431:m2()");}
	static void m3(){}
	class Jason4311{
		Jason4311(){System.out.println("Jason4311()");}
		void m1(){
			System.out.println("Jason4311:m1()");
			Jason431.this.m1();
			}
	}
	static class Jason4312{
		Jason4312(){System.out.println("Jason4312()");}
		void m1(){
			System.out.println("Jason4312:m1()");
		}
	}
}