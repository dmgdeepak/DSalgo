Idea is to use 3 variables 

1: include current element (max in 1 and 2nd array) by adding in excluded values

2: set excluded to max(excluded,include) 

3: to manage 2nd

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int adjacent(int arr[][],int n)
	 {
		 int incl=Math.max(arr[0][0],arr[1][0]);
		 int excl=0,excl2;
		 for(int i=1;i<n;++i)
		 {
			 excl2=Math.max(excl,incl);
			 incl=excl+Math.max(arr[0][i],arr[1][i]);
			 excl=excl2;
		 }
		 return Math.max(incl,excl);
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[][]=new int[2][n];
	    for(int i=0;i<n;++i)
	    arr[0][i]=ab.nextInt();
	    for(int i=0;i<n;++i)
	    arr[1][i]=ab.nextInt();
	    System.out.println(adjacent(arr,n));
	}
	 }
}