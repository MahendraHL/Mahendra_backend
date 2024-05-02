package day3;

public class ExceptionDeclaring {

	public static void main(String[] args) throws ArithmeticException {
		int i=10/0;
		System.out.println(i);
		System.out.println("cannot be divided");
	}

}
