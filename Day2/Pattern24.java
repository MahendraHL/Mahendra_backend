
//        1 
//      2 1 
//    3 2 1 
//  4 3 2 1 
//5 4 3 2 1 

package day2;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j >=1; j--) {
				System.out.print("  ");
			}
			for (int j = i; j >0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			s.close();
		}
	}
}
