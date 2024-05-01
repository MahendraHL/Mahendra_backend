
//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 

package day2;

import java.util.Scanner;

public class Pattern44 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (j % 2 == 0)
					System.out.print(0 + " ");
				else
					System.out.print(1 + " ");
			}
			System.out.println();
		}
		s.close();
	}

}
