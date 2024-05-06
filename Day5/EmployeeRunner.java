package day5;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class EmployeeRunner {
	public static void main(String[] args) {
		HashMap<Integer, Employee> hm = new HashMap<>();
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
			hm.put(id, new Employee(id, name, designation, department));
			System.out.println("Do you want to add more");
			String response = s.next();
			if (response.equalsIgnoreCase("no"))
				break;
		}

		Set<Entry<Integer, Employee>> entrySet = hm.entrySet();
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey() + "====>" + entry.getValue());
		}
		s.close();
	}

}
