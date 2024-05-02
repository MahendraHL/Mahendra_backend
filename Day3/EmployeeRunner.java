package day3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRunner extends Employee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Employee> employeeList = new LinkedList<>();
		while (true) {
			System.out.println("Enter id");
			Integer id = s.nextInt();
			System.out.println("Enter Name");
			String name = s.next();
			System.out.println("Enter salary");
			Double salary = s.nextDouble();
			employeeList.add(new Employee(id, name, salary));
			System.out.println("Do you want to add more");
			if (!s.next().equalsIgnoreCase("yes"))
				break;

		}
		Collections.sort(employeeList);
		employeeList.forEach(System.out :: println );
		s.close();
	}

}
