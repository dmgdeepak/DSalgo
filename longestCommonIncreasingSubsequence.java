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
      int c=0;
      for(int j=0;j<m;++j)
      {
        if(a[i]==b[j])
        res[j]=Math.max(res[j],c+1);
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
