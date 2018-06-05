Pretty print
import java.util.*;
import java.lang.*;
import java.io.*;
class matrix
 {
	 public static void matrix(int ans[][],int n,int i,int j,int res)
	 {
		 for(int k=i;k<=j;++k)
		 {
			 for(int x=i;x<=j;++x)
			 {
				 if(k==i || x==i || k==j || x==j)
					 ans[k][x]=res;
			 }
		 }
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
		int occu=2*n-1;
		int r=occu;
		int ans[][]=new int[occu][occu];
		int j=-1;
		for(int i=n;i>0;--i)
		{
			
			matrix(ans,n,++j,--occu,n--);
		}
		for(int i=0;i<r;++i)
		{for(j=0;j<r;++j)
	    System.out.print(ans[i][j]+" ");
	System.out.println();}
	}
	 }
}