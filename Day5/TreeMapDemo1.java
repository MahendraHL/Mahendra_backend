package day5;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		Comparator<String> com = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return (o1).compareTo(o2);
			}

		};
		TreeMap<String, Integer> marks = new TreeMap<String, Integer>(com);
		marks.put("Smith", 56);
		marks.put("King", 76);
		marks.put("John", null);

		Set<Entry<String, Integer>> entrySet = marks.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "====>" + entry.getValue());
		}
	}

}
