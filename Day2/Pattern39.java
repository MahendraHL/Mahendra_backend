
//   1
//  121
// 12321
//1234321
// 12321
//  121
//   1

package day2;

import java.util.Scanner;

public class Pattern39 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			System.out.println("Enter the value of n");
		    int n =s.nextInt() ;
		    int space = n/2, ch = 1;
		    for(int i = 1;i<=n;i++)
		    {
		      for(int j = 1;j<=space;j++)
		      {
		        System.out.print(" ");
		      }
		    int k = 1;
		    for(int j = 1; j<=ch;j++)
		    {
		      System.out.print(k+"");
		      if(j<=ch/2)
		      k++;
		      else
		      k--;
		    }
		    if(i<=n/2)
		    {
		      space--;
		      ch+=2;
		    }
		    else
		    {
		      space++;
		      ch-=2;
		    }
		    System.out.println();
		    }
		    s.close();
		  }
}
