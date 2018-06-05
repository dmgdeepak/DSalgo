import java.util.*;
import java.lang.*;
import java.io.*;
class oSurroundedByX
 {
   public static void floodFill(char a[][],int i,int j,int n,int m)
   {
     if(i<0 || j<0 || i>=n || j>=m || a[i][j]!='-')
     return ;
     a[i][j]='O';
     floodFill(a,i+1,j,n,m);
     floodFill(a,i,j+1,n,m);
     floodFill(a,i-1,j,n,m);
     floodFill(a,i,j-1,n,m);
   }
 	public static void fn(char arr[][],int n,int m)
 	{
    for(int i=0;i<n;++i)
    for(int j=0;j<m;++j)
    if(arr[i][j]=='O')
    arr[i][j]='-';
    // first row
    for(int i=0;i<m;++i)
    floodFill(arr,0,i,n,m);
    //first col
    for(int i=0;i<n;++i)
    floodFill(arr,i,0,n,m);
    // last row
    for(int i=0;i<m;++i)
    floodFill(arr,n-1,i,n,m);
    //last col
    for(int i=0;i<n;++i)
    floodFill(arr,i,m-1,n,m);

    for(int i=0;i<n;++i)
  {  for(int j=0;j<m;++j)
    {if(arr[i][j]=='-')
    arr[i][j]='X';
    System.out.print(arr[i][j]+" ");
    }
      //System.out.println();
  }
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int m=ab.nextInt();
	    char arr[][]=new char[n][m];
	    for(int i=0;i<n;++i)
	    for(int j=0;j<m;++j)
	    arr[i][j]=ab.next().charAt(0);
	    fn(arr,n,m);
	    System.out.println();
	}
	 }
}
