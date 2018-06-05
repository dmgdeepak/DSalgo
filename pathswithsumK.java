import java.util.*;
import java.lang.*;
import java.io.*;
class pathswithsumK
 {
 	public static int fn(int a[][],int i,int j,int n,int k,int memo[][][])
 	{

    if(i==n-1 && j==n-1 && k==a[i][j])
    return memo[i][j][k]=1;
    if(i>=n || j>=n ||k<0) return 0;
    if(memo[i][j][k]!=-1)
    return memo[i][j][k];
    return memo[i][j][k]=fn(a,i+1,j,n,k-a[i][j],memo)+fn(a,i,j+1,n,k-a[i][j],memo);
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int k=ab.nextInt();
	    int n=ab.nextInt();
	    int arr[][]=new int[n][n];
	    for(int i=0;i<n;++i)
	    for(int j=0;j<n;++j)
	    arr[i][j]=ab.nextInt();
      int memo[][][]=new int[n+1][n+1][k+1];
      for(int row[][]:memo)
        for(int x[]:row)
        Arrays.fill(x,-1);
	    System.out.println(fn(arr,0,0,n,k,memo));
	}
	 }
}
