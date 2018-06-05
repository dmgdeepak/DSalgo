import java.util.*;
import java.lang.*;
import java.io.*;
class subsquareSurroundedX
 {
 	public static int fn(char a[][],int n)
 	{

    int res=0;
    int h[][]=new int[n][n];
    int v[][]=new int[n][n];
    for(int i=0;i<n;++i)
    for(int j=0;j<n;++j)
    {
      if(a[i][j]=='X')
    {  h[i][j]=(j==0)?1:h[i][j-1]+1;
      v[i][j]=(i==0)?1:v[i-1][j]+1;
      res=1;
    }
    else
    h[i][j]=v[i][j]=0;
    }
    if(res==0)
    return 0;
    for(int i=n-1;i>0;--i)
    for(int j=n-1;j>0;--j)
    {
      int small=Math.min(h[i][j],v[i][j]);
      while(small>res)
      {
        if(h[i-small+1][j]>=small && v[i][j-small+1]>=small)
        res=small;

        --small;
      }
    }
    return res;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    char arr[][]=new char[n][n];
	    for(int i=0;i<n;++i)
	    for(int j=0;j<n;++j)
	    arr[i][j]=ab.next().charAt(0);
	    System.out.println(fn(arr,n));
	}
	 }
}
