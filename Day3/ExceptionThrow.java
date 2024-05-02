package day3;

import java.util.Scanner;

public class ExceptionThrow extends PasswordInvalidException{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the password");
		int enteredPassword=s.nextInt();
		int password=1234;
		s.close();
		if(enteredPassword==password) {
			System.out.println("Login Succesful");
		}
		else {
			throw new PasswordInvalidException();
		}
		


	}

}
