
//5 
//5 4 
//5 4 3 
//5 4 3 2 
//5 4 3 2 1 

package day2;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
		
			for (int j = n; j > n-i ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		s.close();

	}

}
