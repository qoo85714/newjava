package tw.org.iii;

public class Jason {
	int a;
	static int b;
	{
		a=100;
		System.out.println("{}:a="+a);
	}
	static{
		System.out.println("static{}");
	}
	Jason(){
		System.out.println("Jason()");
	}
}
