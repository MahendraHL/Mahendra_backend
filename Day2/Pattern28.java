
//    5
//   454
//  34543
// 2345432
//123454321

package day2;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt(); 
		for(int i=n;i>0;i--) 
		{ 
			for(int j=1;j<(2*n);j++) 
			{ 
				if(j<i) 
					System.out.print(" "); 
				else if(j>(2*n-i)) 
					continue; 
				else if(j>n) 
					System.out.print((2*n)-j);		 
				else  
					System.out.print(j);				 
			} 
			System.out.println();	
		}
		s.close();
	}
}