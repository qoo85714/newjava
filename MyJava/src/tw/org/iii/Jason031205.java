package tw.org.iii;

import javax.swing.JOptionPane;

public class Jason031205 {
	//method: create a answer
	static String createAnswer(int d){
		//�~�P
		boolean[] check = new boolean[10];
		int[] poker = new int[d];
		int temp; int counter=0;
		for (int i=0; i<poker.length; i++){
			do{
				temp =(int)(Math.random()*10);
				counter++;
			}while(check[temp]);   
			poker[i] = temp;
			check[temp] = true;
		}
        String ret="";
        for (int v :poker) ret +=v;
        return ret;
	}

	public static void main(String[] args) {
		// 1. Create Answer
		String answer = createAnswer(3);
		System.out.println(answer);
		
		//2. Start
		boolean isWinner = false;
		for (int i=0;i<=10;i++){
			//2-1. input a number string
			String guess = JOptionPane.showInputDialog("猜一個數字");
			//2-2. compare=>result		
	        String result = checkAB(answer, guess);
			JOptionPane.showMessageDialog(null, result);
			if (result.equals("3A0B")){
				isWinner = true;
				break;
			}
		}
		if (isWinner){
			JOptionPane.showMessageDialog(null, "恭喜老爺,賀喜夫人");
		}else{
			JOptionPane.showMessageDialog(null, "Losser, Answer is " + answer);
		}
	}
	static String checkAB(String a, String g){
    	 int A,B; A = B = 0;
    	 for (int i=0; i<g.length();i++){
    		 if(g.charAt(i)== a.charAt(i)){
    			 A++;
    		 }else if(a.indexOf(g.charAt(i))>=0){
    			 B++;
    			 }
    	 }
			
			return A+"A"+B+"B";
		}
     }
//

	
	


