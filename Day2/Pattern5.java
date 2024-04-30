
//a a a a a 
//b b b b b 
//c c c c c 
//d d d d d 
//e e e e e 

package day2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = s.nextInt();
		char ch = 'a';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
			s.close();
		}

	}

}
