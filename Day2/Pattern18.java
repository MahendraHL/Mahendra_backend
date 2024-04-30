
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
package day2;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		char ch = '*';
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= 2*(n-i); j++) {
				System.out.print(ch+" ");
			}
			System.out.println();

		}
		s.close();
	}
}
