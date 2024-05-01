
//   *
//  * *
// *   *
//*     *
// *   *
//  * *
//   *
   
package day2;

import java.util.Scanner;

public class Pattern41 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    System.out.println("Enter the Number : ");
		    int n = s.nextInt();
		    System.out.println("The Pattern is : ");
		    int star=n/2, k=1,l=1;
		    for(int i=1;i<=n;i++)
		    {
		      for(int j=1;j<=star;j++)
		      {
		        System.out.print(" ");
		      }
		    for(int j=1;j<=k;j++)
		    {
		      if(j==1||j==k)
		      System.out.print("*");
		      else
		      System.out.print(" ");
		    }
		    if(i<=n/2)
		    {
		      star--;
		      l++;
		      k=k+2;
		    }
		    else
		    {
		      star++;
		      l--;
		      k=k-2;
		    }
		    System.out.println();
		    }
		    s.close();
	}

}
