//game of death geeeks sol

//logic After the first person (kth from begining) is killed, n-1 persons are left. So we call josephus(n – 1, k) to get the position with n-1 persons. But the position returned by josephus(n – 1, k) will consider the position starting from k%n + 1. So, we must make adjustments to the position returned by josephus(n – 1, k)..

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int check(int n,int k)
     {
        if (n == 1)
    return 1;
  else
    /* The position returned by josephus(n - 1, k) is adjusted because the
       recursive call josephus(n - 1, k) considers the original position 
       k%n + 1 as position 1 */
    return (check(n - 1, k) + k-1) % n + 1;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
	    System.out.println(check(n,k));
	}
	 }
}