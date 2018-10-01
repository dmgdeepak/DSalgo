how to maintain previous count i.e. how to know the number of increasing subsequence for current matched element.

Here we are initiating that with 0 and whenever a match found we put table[i]=current+1
Whenever we got to know that element of arr2[] > arr1[] and table[i] has element > current it means till i we got table[i] increasing subsequence.
Hence change current value.

and if we got match for the same arr1[] element then it will be having value 1 more than previous
if not found then neglect current and start again

import java.util.*;
import java.lang.*;
import java.io.*;
class longestCommonIncreasingSubsequence
 {
 	public static int LCIS(int a[],int b[],int n,int m)
 	{
    int ans=0;
    int res[]=new int[m];
    for(int i=0;i<n;++i)
    {
      //for every same element LIS is 1 (0+1)
      int c=0;
      for(int j=0;j<m;++j)
      {
        if(a[i]==b[j])
        res[j]=Math.max(res[j],c+1);
        // if a[i] is greater than b[j] and we already has LCIS >c then update
        if(a[i]>b[j])
        c=Math.max(c,res[j]);
        ans=Math.max(ans,res[j]);
      }
    }
    return ans;
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
	    int m=ab.nextInt();
	    int arr2[]=new int[m];
	    for(int i=0;i<m;++i)
	    arr2[i]=ab.nextInt();
	    System.out.println(LCIS(arr,arr2,n,m));
	}
	 }
}
