package day3;

public class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;
	private Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}
	@Override
	public int compareTo(Employee o) {
		return this.id.compareTo(o.id);
	}
	

}
