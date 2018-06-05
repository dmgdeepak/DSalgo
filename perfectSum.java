import java.util.*;
import java.lang.*;
import java.io.*;
class perfectSum
 {
 	public static int fn(int a[],int i,int n,int sum,int k)
 	{
    if(i>=n-1)
    return (sum==k)?1:0;
    int res=0;
    for(int j=i+1;j<n;++j)
    res+=fn(a,j,n,sum+a[j],k);
    return res;
  }
public static void main (String[] args)
 {
Scanner ab=new Scanner(System.in);
int t=ab.nextInt();
while(t-->0)
{
    int n=ab.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;++i)
    arr[i]=ab.nextInt();
    System.out.println(fn(arr,-1,n,0,ab.nextInt()));
}
 }
}
