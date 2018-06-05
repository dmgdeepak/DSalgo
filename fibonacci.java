import java.util.*;
class fibonacci
{
public static long fibo(int n,long memo[])
{
if(n<=0)
return 0;
if(n==1)
return 1;
else if(memo[n]!=0)
	return memo[n];
memo[n]=fibo(n-1,memo)+fibo(n-2,memo);
return memo[n];
}
public static void main(String args[])
{
Scanner ab=new Scanner(System.in);
int n=ab.nextInt();
long arr[]=new long[n+1];
Arrays.fill(arr,0);
System.out.println(fibo(n,arr));
}
}