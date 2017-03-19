package tw.org.iii;
public class Jason031902 {
	public static void main(String[] args) {
		//Jason261 b1 = new Jason261();
		Jason261 b1 = new Jason262();
		Jason261 b2 = new Jason261();
		Jason262 b3 = new Jason262();
		Jason263 b4 = new Jason263();
		b2.m1();
		//b2.m2();
		//System.out.println(b2.a);
		myf1(b1);
	}
	static void myf1(Jason261 b){
		b.m1();
		
	}
}
class Jason261{
	int a;
	Jason261(){a++;System.out.println("Jason261()");}
	void m1(){System.out.println("Jason261:m1()");}
}
class Jason262 extends Jason261{
	int b;
	Jason262(){a++;System.out.println("Jason262()");}
	void m1(){System.out.println("Jason262:m1();b="+b);}
	void m2(){System.out.println("Jason262:m2()");}
}
class Jason263 extends Jason262{
}