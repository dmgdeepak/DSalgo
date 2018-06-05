Problem :

A cow produces its first calve (female calf) at the age of two years and proceeds to produce other calves (one female calf a year)

 print in new line the number of animals expected at the end of N years modulo 10^9 + 7

Idea is to use Fibonacci series where n= n+1.

But here n is very large so we will use formula to recur with memoization

F(2n) = F(n)[2*F(n+1) – F(n)]
F(2n + 1) = F(n)2 + F(n+1)2









Code:

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	static Map<Long,Long> map=new HashMap<Long,Long>();
     public static long fib(long n)
     {
         if(n==0)
         return 0;
         if(n==2 || n==1)
         return 1;
//check if already exists in map ( precalculated val)
         if(map.containsKey(n))
         return map.get(n);
         if(n%2!=0)
         {
             long k=(n+1)/2;
             map.put(n,(fib(k)*fib(k)+fib(k-1)*fib(k-1))%1000000007);
         }
         else{
         long k=n/2;
         map.put(n,(fib(k)*((fib(k-1)<<1)+fib(k)))%1000000007);
             
         }
         return map.get(n);
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(fib(ab.nextLong()+1));
	}
	 }
}