package tw.org.iii;

public class Jason041501 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		//mt1.run();///表現生命特徵 用start方法  只能使用一次
		mt1.start();
		mt2.start();
		try {//讓HelloWorld在4左右時出現
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello,World");
	}
}
//
class MyThread extends Thread{
	private String name;
	MyThread(String name){this.name= name;}
		@Override
		public void run() {
			for(int i=0;i<10;i++){
				System.out.println(name+":"+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				
				}
			}
		}
}