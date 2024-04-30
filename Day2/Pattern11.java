
//5 5 5 5 5 
//4 4 4 4 
//3 3 3 
//2 2 
//1 

package day2;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i + " ");
			}
			System.out.println();

		}
		s.close();

	}

}
