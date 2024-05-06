package day5;


import java.util.LinkedHashMap;
//import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {


	
		public static void main(String[] args) {
			LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();
			marks.put("Smith", 56);
			marks.put("King", 76);
			marks.put("John", null);

//			Iterator<String> itr=marks.keySet().iterator();
//			while(itr.hasNext()) {
//				String str=itr.next();
//				System.out.println(str+"======>"+marks.get(str));
//			}
			Set<Entry<String, Integer>> entrySet = marks.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				System.out.println(entry.getKey() + "====>" + entry.getValue());
			}
		}

	}


