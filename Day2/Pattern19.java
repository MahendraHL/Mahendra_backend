
//   	  1 
//      1 0 1 
//    1 0 1 0 1 
//  1 0 1 0 1 0 1 
//1 0 1 0 1 0 1 0 1 

package day2;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= 2 * (n - i); j++) {
					if(j%2==0)
						System.out.print(1+" ");
					else
						System.out.print(0+" ");
			}
			System.out.println();

		}
		s.close();
	}
}
