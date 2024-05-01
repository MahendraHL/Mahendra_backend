
//        1 
//      1 * 2 
//    1 * 2 * 3 
//  1 * 2 * 3 * 4 
//1 * 2 * 3 * 4 * 5 

package day2;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				if (j<i)
					System.out.print("* ");
		
					
			}
			System.out.println();
		}
		s.close();
	}

}
