package day5;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Books b1=new Books(1,"DBMS",200.0f,150);
		Books b2=new Books(2,"Core Java",350.0f,290);
		Books b3=new Books(3,"Python",250.0f,300);
		
		Consumer<String> c=System.out::println;
		c.accept(b3.getBname());
		
		
	}

}
