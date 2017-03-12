package tw.org.iii;

public class Jason031106 {
//
	public static void main(String[] args) {
		int [] p = new int[6];
		for (int i=0; i<10;i++){
		int dice =(int)(Math.random()*9); //0-8=>6,7,8
		p[dice>=6?dice-3:dice]++;
	}
	for (int i=0; i<p.length; i++){
		System.out.println( (i+1) + "點出現" + p[i] + "次");
	}
		
	}

}
