package tw.org.iii;

import java.util.LinkedList;

public class Jason040904 {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("B");
		System.out.println(list1);
		list1.remove("B");
		System.out.println(list1);
		
	}

}
