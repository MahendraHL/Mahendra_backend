package day4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	private Integer id;
	private String name;
	private Integer marks;
	private Integer age;

	public TreeSetDemo() {
		super();
	}

	public TreeSetDemo(Integer id, String name, Integer marks, Integer age) {
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


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<TreeSetDemo> ts = new TreeSet<>((lhs1,lhs2)->lhs1.getId()-lhs2.getId());
		while (true) {
			System.out.println("enter the id");
			int id = s.nextInt();
			System.out.println("enter the name");
			String name = s.next();
			System.out.println("Enter marks");
			int marks = s.nextInt();
			System.out.println("Enter age");
			int age = s.nextInt();
			ts.add(new TreeSetDemo(id, name, marks, age));
			System.out.println("Do you want to add more");
			String response = s.next();
			if (response.equalsIgnoreCase("no"))
				break;

		}
		for (TreeSetDemo lhs : ts) {
			System.out.println(lhs);
		}
		s.close();
	}
}
