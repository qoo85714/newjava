package tw.org.iii;

public class Jason031901 {

	public static void main(String[] args) {
		Jason253.m1();
		//Jason253 b1 = new Jason253(); 

	}

}
class Jason251{
	static {System.out.println("s1");}
	Jason251(){System.out.println("Jason251()");}
	Jason251(int a){System.out.println("Jason251(int)");}
	
}
class Jason252 extends Jason251{
	static {System.out.println("s2");}
	Jason252(String a){
		//super(2);
		System.out.println("Jason252(String)");
	}
}
class Jason253 extends Jason252{
	static {System.out.println("s3");}
	Jason253(){
		super ("Jason");
		System.out.println("Jason253()");
		
	}
	static void m1(){System.out.println("m1()");}
}
