Problem: 
Given an array of positive integers, Your task is to  find maximum possible value K such that the array has at-least K elements that are greater than or equal to K

Idea is to save frequency of number 
1) if no. is > number
++freq of n
else
	freq of number

import java.util.*;
import java.lang.*;
import java.io.*;
class hackerranksolutionc
 {
     public static int getK(int arr[],int n)
	 {
		 int freq[]=new int[n+1];
		 for(int i=0;i<n;++i)
		 {
			 if(arr[i]>=n)
				 ++freq[n];
			 else
				++freq[arr[i]] ;
		 }
		 int sum=0;
		 for(int i=n;i>0;--i)
		 {
			 sum+=freq[i];
			 if(sum>=i)
				 return i;
		 }
		 return 0;
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
	    System.out.println(getK(arr,n));
	}
	 }
}