
//1 2 3 4 3 2 1 
//  2 3 4 3 2 
//    3 4 3 
//      4 
//    3 4 3 
//  2 3 4 3 2 
//1 2 3 4 3 2 1 

package day2;

import java.util.Scanner;

public class Pattern37 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int space=0,ch=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			int num=space+1;
			for(int k=1;k<=ch;k++) {
				System.out.print(num+" ");
				if(k<=ch/2)
					num++;
				else
					num--;
			}
			if(i<=n/2) {
				space++;
				ch-=2;
			}
			else {
				space--;
				ch+=2;
			}
			System.out.println();
		}
		s.close();

	}

}