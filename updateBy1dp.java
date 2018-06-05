Idea is to store frequency of number and whenever it is needed to increment (i>=j), count will be increased


import java.util.*;
import java.lang.*;
import java.io.*;
class updateBy1dp
 {
	 public static void updateBy1(int n,int k,int freq[])
	 {
		 int count=0;
		 int arr[]=new int[n];
		 for(int i=0;i<n;++i)
		 {
			 if(freq[i]>0)
				 count+=freq[i];
			 arr[i]+=count;
		 }
		 for(int x:arr)
			 System.out.print(x+" ");
		  System.out.println();
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
	    int freq[]=new int[n];
	    for(int i=0;i<k;++i)
	    ++freq[ab.nextInt()-1];
	    updateBy1(n,k,freq);
	}
	 }
}