import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int weightInBag(ArrayList<Integer> wt,ArrayList<Integer> cost,int w)
     {
         int size=wt.size();
         int dp[][]=new int[size+1][w+1];
         
         Arrays.fill(dp[0],Integer.MAX_VALUE);
         for(int i=1;i<=size;++i)
         {
             
             for(int j=1;j<=w;++j)
             {
                if(wt.get(i-1)>j)  
                dp[i][j]=dp[i-1][j];
                else
                dp[i][j]=Math.min(dp[i-1][j],cost.get(i-1)+dp[i][j-wt.get(i-1)]);
             }
         }
         return (dp[size][w]==Integer.MAX_VALUE || dp[size][w]<0)?-1:dp[size][w];
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int w=ab.nextInt();
	    ArrayList<Integer> wt=new ArrayList<Integer>();
	    ArrayList<Integer> cost=new ArrayList<Integer>();
	    for(int i=1;i<=n;++i)
	    {int c=ab.nextInt();
	        if(c!=-1)
	        {wt.add(i);
	            cost.add(c);
	        }
	    }
	    System.out.println(weightInBag(wt,cost,w));
	}
	 }
}