package tw.org.iii;

public class Jason031104 {
	public static void main(String[] args) {
		for (int i=1,j=10;i<10;i++,j--){
            System.out.println(i +":"+ j);
            if(j==7){
            	break;
            }
	}
		System.out.println("-------------");
		
		for (int i=0; i<10;i++){
			if (i%2==0) continue;
			System.out.println(i);
		}
		System.out.println("-------------");
		jason:
		for (int i=0; i<10;i++){
			for(int j=9;j>0;j--){
				System.out.println(i+ ":" + j);
				if (j%5==0) continue jason;
				
			}
		}
}
}