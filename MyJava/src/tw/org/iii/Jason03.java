package tw.org.iii;

public class Jason03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score = Math.random();
		int intScore =(int)(Math.random()*101);
		System.out.println(intScore);
		
		if(intScore>=60){
			System.out.println("Pass");
		}else{
		System.out.println("Flunk");}
		
}
}

