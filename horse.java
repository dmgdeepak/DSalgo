import java.io.*;
import java.util.*;
import java.util.regex.*;
public class horse {
	static int count=0;
	public static boolean isSafe(int col,int row,int n,int m,boolean mat[][])
	{
		if(row+2<n && col+1<m && mat[row+2][col+1] )
			return false;
		if(row+1<n && col+2<m && mat[row+1][col+2] )
			return false;
		if()
	}
	public static void nqueen(int col,boolean mat[][],int n,int m) 
	{
		if(col>m)
		{
			count++;
			return;
		}
		for(int i=0;i<m;++i)
		{
			if(isSafe(col,i,n,m,mat))
			{
				mat[i][col]=true;
				nqueen(col+1,mat,n,m);
				mat[i][col]=false;
			}
		}
	}
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
		int t=ab.nextInt();
		while(t-->0)
		{
			
		}
		}}