
//A B C D E
//A B C D E
//A B C D E
//A B C D E
//A B C D E

package day2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= n; j++) {

				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();

		}
		s.close();

	}

}
