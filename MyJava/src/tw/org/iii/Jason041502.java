package tw.org.iii;

public class Jason041502 {

	public static void main(String[] args) {
		Thread2 t2 = new Thread2("A"); //t2不是執行序 只有run方法 無start方法
		Thread tt2= new Thread(t2);	   //要把runnable塞進去
		
		Thread2 t3 = new Thread2("B"); 
		Thread tt3= new Thread(t3);	   
		tt2.start();
		tt3.start();
	}
}
class Thread2 implements Runnable{
	String name;
	public Thread2(String name) {this.name=name;}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(name + ":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}