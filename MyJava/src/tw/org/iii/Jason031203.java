package tw.org.iii;

public class Jason031203 {

	public static void main(String[] args) {
//		int a= 1;
//		while(a<10){
//			System.out.println(a++);
		//累加公式
		// while用法
		int a=1; int sum=0;
		while (a<=100){
			sum += a++;
	}
		System.out.println("1 + 2 + ...+100="+ sum);
		System.out.println("---");
		// for 用法
		a = 1;sum =0;
		for(;a<=100;){
			sum += a++;
		}
		System.out.println("1 + 2 + ...+100="+ sum);
		System.out.println("---");
	}
}

