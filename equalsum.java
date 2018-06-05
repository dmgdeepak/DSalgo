import java.util.*;
import java.lang.*;
import java.io.*;
class equalsum
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t>0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    int lsum,rsum;
	    boolean flag=false;
	    for(int i=1;i<n;i++)
	    {
	        lsum=0;
	        rsum=0;
	        for(int j=i-1;j>=0;j--)
	        {
	            lsum=lsum+arr[j];
	        }
	        
	        for(int j=i+1;j<n;j++)
	        {
	            rsum+=arr[j];
	         //   if(rsum>lsum)
	         //   break;
	        }
	        System.out.println("i "+i+" "+lsum+"rsum"+rsum);
	        if(lsum==rsum && lsum!=0)
	        {
	        System.out.println(lsum+"YES"+rsum);
	        flag=true;
	        break;
	    }
	    }
	    if(!flag)
	    System.out.println("NO");
	    t--;
	}
	 }
}