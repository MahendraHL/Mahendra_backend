
//* * * * * * * 
//* *       * * 
//*   *   *   * 
//*     *     * 
//*   *   *   * 
//* *       * * 
//* * * * * * * 

package day2;

import java.util.Scanner;

public class Pattern43 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (j == 1 || j == n || i == 1 || i == n || j == i || j+i-1==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		s.close();
	}

}
