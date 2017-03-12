package tw.org.iii;

public class Jason0311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score = Math.random();
		int intScore =(int)(Math.random()*101);
		System.out.println(intScore);
		
		if(intScore>=90){
			System.out.println("A");
		}else if(intScore>=80){
			System.out.println("B");
		}else if(intScore>=70){
			System.out.println("C");
		}else if(intScore>=60){
			System.out.println("D");
		}else{	
		System.out.println("Flunk");}
		
}

	}


