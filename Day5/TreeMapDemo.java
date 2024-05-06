package day5;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMapDemo {
	public static void main(String[] args) {
		//if the generic is integer type it is not necessary to use comparator
//		Comparator<Integer> com = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return (o1).compareTo(o2);
//			}
//			
//		};
		
		// we can pass it to treemap constuctor
//		Comparator<Integer> c=Comparable::compareTo;
		
		//by using lamda function
//		TreeMap<Integer, Employee> tm = new TreeMap<>((o1,o2)->o1.compareTo(o2));
		
//		instead of that we can use
		TreeMap<Integer, Employee> tm = new TreeMap<>(Comparable::compareTo);
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter employee id");
			Integer id = s.nextInt();
			System.out.println("Enter employee name");
			String name = s.next();
			System.out.println("Enter employee designation");
			String designation = s.next();
			System.out.println("Enter employee department");
			String department = s.next();
			tm.put(id, new Employee(id, name, designation, department));
			System.out.println("Do you want to add more");
			String response = s.next();
			if (response.equalsIgnoreCase("no"))
				break;
		}

		Set<Entry<Integer, Employee>> entrySet = tm.entrySet();
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey() + "====>" + entry.getValue());
		}
		s.close();
	}

}
