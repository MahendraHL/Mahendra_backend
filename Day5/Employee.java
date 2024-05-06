package day5;

public class Employee {

private Integer id;
private String name;
private String designation;
private String department;
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
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Employee(Integer id, String name, String designation, String department) {
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.department = department;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department;
}

}
