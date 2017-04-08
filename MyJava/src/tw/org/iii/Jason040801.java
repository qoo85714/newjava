package tw.org.iii;
public class Jason040801 {
	public static void main(String[] args) {
		sayYa1("Brad","Peter","Andy","Jason");
		sayYa2(new String[]{"Brad2","Peter2","Andy2","Jason2"});

	}
//	static void sayYa(String name){
//		System.out.println("Ya,"+ name);
//	}
//	static void sayYa(String name1,String name2){
//		System.out.println("Ya,"+ name1);
//		System.out.println("Ya,"+ name2);
//	}
	static void sayYa1(String...names){
		for (String name : names){
			System.out.println("Ya,"+ name);
		}
	}	
	static void sayYa2(String[] names){
		for (String name : names){
			System.out.println("Ya,"+ name);
			}
	}
}
