package day4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Student {

	private Integer id;
	private String name;
	private Integer marks;
	private Integer age;

	public Student() {
		super();
	}

	public Student(Integer id, String name, Integer marks, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

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

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age;
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.hashCode() == student.hashCode() && this.name == student.name && this.marks == student.marks;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<Student> hs = new HashSet<>();
		while (true) {
			System.out.println("enter the id");
			int id = s.nextInt();
			System.out.println("enter the name");
			String name = s.next();
			System.out.println("Enter marks");
			int marks = s.nextInt();
			System.out.println("Enter age");
			int age = s.nextInt();
			hs.add(new Student(id, name, marks, age));
			System.out.println("Do you want to add more");
			String response = s.next();
			if (response.equalsIgnoreCase("no"))
				break;
			
		}
		for (Student st : hs) {
			System.out.println(st);
		}
		s.close();
	}

}
