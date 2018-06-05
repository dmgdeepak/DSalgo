import java.util.*;
import java.lang.*;
import java.io.*;
class maxAbsolutediff
 {
 	public static int fn(int a[],int n)
 	{
    int l[]=new int[n];
    int r[]=new int[n];
    int cursum=a[0],maxsum=a[0];
    l[0]=a[0];
    for(int i=1;i<n;++i)
    {
      if(cursum>0)
      {
        cursum=0;
      }
      cursum+=a[i];
      if(maxsum>cursum)
      maxsum=cursum;
      l[i]=maxsum;
    }
    cursum=a[n-1];
    maxsum=a[n-1];
    r[n-1]=a[n-1];
    for(int i=n-2;i>=0;--i)
    {
      if(cursum<0)
      cursum=0;
      cursum+=a[i];
      if(maxsum<cursum)
      maxsum=cursum;
      r[i]=maxsum;
    }
    int res=Integer.MIN_VALUE;
    for(int i=0;i<n;++i)
    {
      res=Math.max(res,Math.abs(l[i]-r[i]));
    }
    /*for(int x:l)
    System.out.print(x+" ");*/
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
    System.out.println(fn(arr,n));
}
	 }
}
