package tw.org.iii;
public class Jason032505 {
	public static void main(String[] args) {
		new Jason471().m1();
	}
}
class Jason471{
	void m1(){
		try{
			System.out.println("do somehting");
			throw new Exception();
			//return;
		}catch(Exception ee){
			System.out.println("catch");
			return;
		}finally{
			System.out.println("OK");
		}
		//System.out.println("end");
	}
}