
//        1 
//      2 1 2 
//    3 2 1 2 3 
//  4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5 


package day2;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the value of n");
	int n= s.nextInt();
	for (int i = 1; i <= n; i++) {
		for(int j=1; j<=n-i;j++) {
			System.out.print("  ");
		}
		for (int j = i; j >= 1; j--) {
			System.out.print(j+" ");
			
		}
		for (int j = 2; j <= i; j++) {
			System.out.print(j+" ");
			
		}
		System.out.println();
	}
	
	s.close();
	}

}
