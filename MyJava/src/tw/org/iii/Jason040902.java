package tw.org.iii;

import java.util.HashSet;
import java.util.Iterator;

public class Jason040902 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		int i1 = 12 ;
		Integer i2 = new Integer(34);
		set.add(i2);
		set.add(i1); // i1 =>auto-boxing => new Integer (i1)
		System.out.println(set);
		System.out.println("-------");
//		Iterator it = set.iterator();
//		while (it.hasNext()){
//			Object obj = it.next();
//			Integer i = (Integer)obj;
//			System.out.println(i.floatValue());
		// is a Collection => for each
		for (Object obj : set){
			System.out.println((Integer)obj);
		}
		
		

//		Integer i1 = new Integer(12);
//		Integer i2 = new Integer("34");
//		int ii3 = 56 ;
//		Integer i3 = ii3;
//		System.out.println(i3);
	}

}


