package day4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	private Integer eId;
	private String eName;
	private Double salary;
	
	public Employee() {
		
	}
	public Employee(Integer eId, String eName, Double salary) {
		this.eId=eId;
		this.eName=eName;
		this.salary=salary;
	}
	
	public void setEid(Integer eId)
	{
		this.eId=eId;
	}
	public Integer geteId() {
		return eId;
	}
	public void setEname(String eName) {
		this.eName=eName;
	}
	public String getEname() {
		return eName;
	}
	public void setSalary(Double salary) {
		this.salary=salary;
	}
	public Double getSalary() {
		return salary;
	}
	
	


	@Override
	public String toString() {
		return "eId=" + eId + ", eName=" + eName + ", salary=" + salary ;
	}
	@Override
	public int hashCode() {
		return eId;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		return this.hashCode()==emp.hashCode();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Set<Employee> hs=new HashSet<>();
		while(true) {
			System.out.println("enter the eid");
			int eId=s.nextInt();
			System.out.println("enter the name");
			String eName=s.next();
			System.out.println("Enter salary");
			double salary=s.nextDouble();
			hs.add(new Employee(eId,eName,salary));
			System.out.println("Do you want to add more");
			String response=s.next();
			if(response.equalsIgnoreCase("no"))
				break;
			
		}
		for(Employee emp:hs) {
			System.out.println(emp);
		}
		s.close();
	}

}
