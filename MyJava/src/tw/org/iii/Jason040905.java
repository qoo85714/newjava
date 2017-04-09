package tw.org.iii;

import java.util.HashMap;
import java.util.Set;

public class Jason040905 {
	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("name", "Brad");
		map.put("weight", 80.5);
		map.put("gender", true);
//		System.out.println(map.get("weight"));
//		System.out.println(map);
//		map.put("weight", 70.5);
//		System.out.println(map.get("weight"));
		Set<String> keys =map.keySet();
		for (String key :keys){
			System.out.println(key + " => " + map.get(key));
		}
	}

}
