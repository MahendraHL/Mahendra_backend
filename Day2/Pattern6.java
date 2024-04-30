
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 

package day2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value of n");
		int rows=s.nextInt();
		for (int i = rows; i >= 1; i--) {
			int n=rows;
			for (int j = n; j >= 1; j--) {
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		
		}
		s.close();
		
	}

}
