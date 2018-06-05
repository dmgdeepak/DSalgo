import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t>0)
	{
	    int count=0;
	    int m=ab.nextInt();
	    int s=ab.nextInt();
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=ab.nextInt();
	    m=m*60;
	    for(int i=0;i<n;i++)
	    for(int j=0;j<n-i-1;j++)
	    {
	    if(arr[j]>arr[j+1])
	    {
	        int temp=arr[j];
	        arr[j]=arr[j+1];
	        arr[j+1]=arr[j];
	        count++;
	        if(s*count>m)
	        {
	        System.out.println("0");
	        
	        }
	    }
	    }
	    System.out.println("1");
	    t--;
	}
	 }
}