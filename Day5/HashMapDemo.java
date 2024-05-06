package day5;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Smith", 56);
		marks.put("King", 76);
		marks.put("John", null);

//		Iterator<String> itr=marks.keySet().iterator();
//		while(itr.hasNext()) {
//			String str=itr.next();
//			System.out.println(str+"======>"+marks.get(str));
//		}
		Set<Entry<String, Integer>> entrySet = marks.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "====>" + entry.getValue());
		}
	}

}
