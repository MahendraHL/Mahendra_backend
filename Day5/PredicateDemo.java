package day5;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Books b1=new Books(1,"DBMS",200.0f,150);
		Books b2=new Books(2,"Core Java",350.0f,290);
		Books b3=new Books(3,"Python",250.0f,300);
		
		
		Predicate<Books> pd=p->p.getPrice()>300;
		System.out.println(pd.test(b1));
		 Predicate<Books> pd1=p1->p1.getPages()>200;
		 System.out.println(pd.and(pd1).test(b2));
		 System.out.println(pd.and(pd1).test(b3));
	
	}

}
