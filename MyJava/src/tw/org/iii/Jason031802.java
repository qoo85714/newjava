package tw.org.iii;

public class Jason031802 {

	public static void main(String[] args) {
		System.out.println(TWid0318.isCheckOK("A13456789"));
		TWid0318 id1 =new TWid0318("A13456789");
		System.out.println(id1.getId());
		if(id1.isFemale()){
			System.out.println("女生");
		}else{
			System.out.println("男生");
			
		}

	}

}
