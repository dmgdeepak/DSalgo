import java.util.*;
import java.lang.*;
import java.io.*;
class prettyprint
 {
	 public static void matrix(int n)
	 {
		int end=(2*n-1)/2;
		int min=1;
		int ans[][]=new int[end+1][2*n-1];
		while(end>=0)
		{
			int lo=0,h=2*n-2;
			int sol=n;
			while(lo<=h)
			{
				ans[end][lo]=sol;
				ans[end][h]=sol;
				if(sol>min)
					--sol;
				++lo;
				--h;
			}
			--end;
			++min;
		}
		
		for(int i=0;i<(2*n-1)/2+1;++i)
		{for(int j=0;j<2*n-1;++j)
	    System.out.print(ans[i][j]+" ");
	System.out.println();}
	for(int i=(2*n-1)/2-1;i>=0;--i)
		{for(int j=0;j<2*n-1;++j)
	    System.out.print(ans[i][j]+" ");
	System.out.println();}
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
		int j=-1;
			matrix(n);
	}
	 }
}