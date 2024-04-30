
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 
//          
package day2;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		for (int i = n; i>=0; i--) {
			for(int j=n-i;j>=1;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
			s.close();
		}

	}

}
