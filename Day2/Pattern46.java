package day2;

import java.util.Scanner;

public class Pattern46 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = 1; j < 2 * n; j++) {
				if (j <= i) {
					System.out.print(j + " ");
				} else if (n * 2 - j <= i) {
					System.out.print(n * 2 - j + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		s.close();
	}

}
