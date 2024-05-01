
//5 4 3 2 1 2 3 4 5 
//  4 3 2 1 2 3 4 
//    3 2 1 2 3 
//      2 1 2 
//        1 
        
package day2;

import java.util.Scanner;

public class Pattern33 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		for (int i = n; i >= 1; i--) {
			int num=i;
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <= 2*i-1; j++) {
				if(j<i) {
				System.out.print(num+" ");
				num--;
				}
				else {
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
			s.close();
		}
	}

}
