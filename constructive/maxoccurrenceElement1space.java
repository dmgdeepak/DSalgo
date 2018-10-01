// idea is to increment array (arr[arr[i]%k])value with k
//by the end the maximum value index will be result and to get array back just change value to arr[i]%k

//confusion : what is maximum occurence is of 1 and another element having value k-1 then it may happen that greatest value will have max value than 1

// No , as if occurence is x then k will be added x times which will be greater than k-1 element :)
import java.util.*;
import java.lang.*;
import java.io.*;
class maxElement1space
 {
	 public static int maxElement(int arr[],int n,int k)
	 {
		 for(int i=0;i<n;++i)
		 {
			 arr[(arr[i]%k)]+=k;
		 }
		 int max=arr[0];
		 int index=0;
		 for(int i=1;i<n;++i)
		 {
			 if(max<arr[i])
			 {
				 max=arr[i];
				 index=i;
			 }
		 }
		 return index;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
		int k=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(maxElement(arr,n,k));
	}
	 }
}



// in case we have two or more element appearing same time then to find first max occurence is to subtract orignal array elements from array index and get max

/*check for
84 47 
18 23 17 26 16 3 28 28 10 17 44 28 2 20 22 21 18 36 34 37 18 38 20 1 31 17 20 6 27 37 11 24 39 7 3 9 36 31 16 46 27 13 6 9 13 28 9 31 44 43 1 15 35 21 42 45 38 41 4 18 32 15 22 3 1 25 38 37 36 34 15 16 0 22 4 39 29 14 3 5 10 4 20 24
*/	 public static int maxElement(int arr[],int n,int k)
	 {
		 for(int i=0;i<n;++i)
		 {
			 arr[(arr[i]%k)]+=k;
		 }
		 int max=arr[0];
		 int index=0;
		 for(int i=0;i<n;++i)
		 arr[i]-=arr[i]%k;
		 for(int i=1;i<n;++i)
		 {
			 if(max<arr[i])
			 {
				 max=arr[i];
				 index=i;
			 }
		 }
		 return index;
	 }