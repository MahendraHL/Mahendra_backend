package day3;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("enter the value of n");
			int n = s.nextInt();
			int i = n / 0;
			System.out.println(i);

		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("Reason for Exception is: " + e.getMessage());
		} finally {
			System.out.println("scanner closed");
			s.close();
		}
	}

}
