package tw.org.iii;

public class Jason0312Pocker {

	public static void main(String[] args) {
		int[] poker = new int[52];
		boolean isRepeat; int temp ;
		for (int i=0; i<52; i++){
			do{
			   temp =(int)(Math.random()*52);
			   isRepeat = false;
			   for (int j=0; j<i ; j++){
				if(poker[j]==temp){
				   isRepeat= true;
				   break;
				}
				}
			
		    } while(isRepeat);
			
			poker[i]=temp;
		    System.out.println(poker[i]);
			}
				}
			
		}

	


