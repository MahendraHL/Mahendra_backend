
//1 1 1 1 1 
//2 2 2 2 
//3 3 3 
//4 4 
//5 

package day2;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}
		s.close();
	}

}
