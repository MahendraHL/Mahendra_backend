
//* * * * * * * 
//  * * * * * 
//    * * * 
//      * 
//    * * * 
//  * * * * * 
//* * * * * * * 

package day2;

import java.util.Scanner;

public class Pattern35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		for (int i = n; i >= 1; i-=2) {
			for (int j = 1; j <= (n - i)/2; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 3; i <=n; i+=2) {
			for (int j = 1; j <= (n - i)/2; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		s.close();
	}

}
