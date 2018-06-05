import java.util.*;
import java.lang.*;
import java.io.*;
class largestrectangleare
 {
	 public static int maxArea(int arr[][],int r,int c)
	 {
		 Integer dp[][]=new Integer[r+1][c+1];
		 for(int i=0;i<c;++i)
		 {
			 dp[0][i]=arr[0][i];
			 for(int j=1;j<r;++j)
			 {
				 dp[j][i]=(arr[j][i]==0)?0:dp[j-1][i]+1;
			 }
		 }
		 for(int i=0;i<r;++i)
			 Arrays.sort(dp[i],Collections.reverseOrder());
		 int cur=0,max=0;
		 for(int i=0;i<r;++i)
		 {
			 for(int j=0;j<c;++j)
			 {
				 //as matrix is stored in form of consecutive 1's,after sorting we will get area by this frmula
				 cur=(j+1)*dp[i][j];
				 if(cur>max)
					 max=cur;
			 }
		 }
		 return max;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int r=ab.nextInt();
	    int c=ab.nextInt();
	    int arr[][]=new int[r][c];
	    for(int i=0;i<r;++i)
			for(int j=0;j<c;++j)
			{
				arr[i][j]=ab.nextInt();
			}
	    System.out.println(maxArea(arr,r,c));
	}
	 }
}









import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int maxArea(int arr[][],int r,int c)
	 {
		 Integer dp[][]=new Integer[r+1][c+1];
		 for(int i=0;i<c;++i)
		 {
			 dp[0][i]=arr[0][i];
			 for(int j=1;j<r;++j)
			 {
				 dp[j][i]=(arr[j][i]==0)?0:dp[j-1][i]+1;
			 }
		 }
		for (int i=0; i<r; i++)
    {
        int count[] = new int[r+1];
 
        // counting occurrence
        for (int j=0; j<c; j++)
            count[dp[i][j]]++;
 
        //  Traverse the count array from right side
        int col_no = 0;
        for (int j=r; j>=0; j--)
        {
            if (count[j] > 0)
            {
                for (int k=0; k<count[j]; k++)
                {
                    dp[i][col_no] = j;
                    col_no++;
                }
            }
        }
    }
		 int cur=0,max=0;
		 for(int i=0;i<r;++i)
		 {
			 for(int j=0;j<c;++j)
			 {
				 //as matrix is stored in form of consecutive 1's,after sorting we will get area by this frmula
				 cur=(j+1)*dp[i][j];
				 if(cur>max)
					 max=cur;
			 }
		 }
		 return max;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int r=ab.nextInt();
	    int c=ab.nextInt();
	    int arr[][]=new int[r][c];
	    for(int i=0;i<r;++i)
			for(int j=0;j<c;++j)
			{
				arr[i][j]=ab.nextInt();
			}
	    System.out.println(maxArea(arr,r,c));
	}
	 }
}