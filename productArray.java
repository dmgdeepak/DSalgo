import java.util.*;
import java.lang.*;
import java.io.*;
class productArray
 {
 	public static void printProductArray(int arr[],int n)
  {
  long res=1;
  for(int i=n-1;i>0;--i)
  {
    res*=arr[i];
  }
  System.out.print(res+" ");
  for(int i=1;i<n;++i)
  {
    res/=arr[i];
    res*=arr[i-1];
    System.out.print(res+" ");}
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
      printProductArray(arr,n);
	    System.out.println();
	}
	 }
}
