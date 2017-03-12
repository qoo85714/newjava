package tw.org.iii;

import java.util.Arrays;

public class Jason0312Pocker2 {

	public static void main(String[] args) {
		//洗牌
		boolean[] check = new boolean[52];
		int[] poker = new int[52];
		int temp;
		for (int i=0; i<52; i++){
			do{
				temp =(int)(Math.random()*52);
			}while(check[temp]);
			   
			poker[i] = temp;
			check[temp] =true ;
			//System.out.println(temp);
		}
		//發牌=>四個玩=>每人13張
		int[][]player=new int[4][13];
		for(int i=0;i<poker.length;i++){
			player[i%4][i/4] = poker[i];
		}
		System.out.println("---------");
		//攤牌
		String[] suits ={"黑桃","紅心","方塊","梅花"};
		String[] values ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int [] cards:player){
			//理牌
			Arrays.sort(cards);
			for(int card: cards){
			   System.out.print(suits[card/13] + values[card%13]+ " ");
		    }
			System.out.println();
			
		    } 
	        }
}
			
				
			
		

	


