package day2;


//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		char ch='*';
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(ch + " ");
			}
			System.out.println();

		}
		s.close();

	}

}
