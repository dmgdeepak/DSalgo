
import java.util.*;
import java.lang.*;
import java.io.*;
class numberOfPossiblePathsdp
 {
	 public static int numberOfPaths(boolean arr[][],int u,int v,int e,int n)
	 {
		 int dp[][][]=new int[n][n][e+1];
		for(int i=0;i<=e;++i) //edge
			for(int j=0;j<n;++j) // source
			for(int k=0;k<n;++k) // destination
			{
				// if source and destination are equal
				if(i==0 && k==j)
					dp[j][k][i]=1;
				//if destination can be reached from source by only 1 edge
				if(i==1 && arr[j][k])
					dp[j][k][i]=1;
				if(i>1)
				{
					//try with an intermediate vertex l such that j to l there is a path 
					for(int l=0;l<n;++l)
					{
						if(arr[j][l])
						dp[j][k][i]+=dp[l][k][i-1]; // path with edge-1 from l to k and 1 edge is required to reach from source to l
					}
				}
			}
			return dp[u][v][e];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    boolean arr[][]=new boolean[n][n];
	    for(int i=0;i<n;++i)
	    for(int j=0;j<n;++j)
	    arr[i][j]=(ab.nextInt()==1)?true:false;
	    System.out.println(numberOfPaths(arr,ab.nextInt(),ab.nextInt(),ab.nextInt(),n));
	}
	 }
}