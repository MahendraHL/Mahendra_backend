
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 

package day2;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		s.close();


	}

}
