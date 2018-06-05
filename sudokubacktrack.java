import java.util.*;
import java.lang.*;
import java.io.*;
class sudokubacktrack
 {
   public static int[] unassigned(int a[][])
   {
     int x[]=new int[2];
     for(int i=0;i<9;++i)
     for(int j=0;j<9;++j)
      if(a[i][j]==0)
      {
        x[0]=i;
        x[1]=j;
        return x;}
        x[0]=-1;
        return x;
   }
   public static boolean isSafe(int a[][],int r,int c,int n)
   {
     return (checkRow(a,r,n) && checkCol(a,c,n) && gridCheck(a,r-r%3,c-c%3,n));
   }
   public static boolean checkCol(int a[][],int c,int n)
   {
     for(int i=0;i<9;++i)
      if(a[i][c]==n)
      return false;
      return true;
   }
   public static boolean checkRow(int a[][],int r,int n)
   {
     for(int i=0;i<9;++i)
      if(a[r][i]==n)
      return false;
      return true;
   }
   public static boolean gridCheck(int a[][],int r,int c,int n)
   {
     for(int i=0;i<3;++i)
     for(int j=0;j<3;++j)
     {
       if(a[r+i][c+j]==n)
       return false;
     }
     return true;
   }
 	public static int fn(int a[][])
 	{
    int v[]=unassigned(a);
    if(v[0]==-1)
    return 1;
    for(int i=1;i<=9;++i)
    {
    if(isSafe(a,v[0],v[1],i))
      {a[v[0]][v[1]]=i;
      if(fn(a)==1)
    return 1;}
      a[v[0]][v[1]]=0;
    }
    return 0;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{ int arr[][]=new int[9][9];
	    for(int i=0;i<9;++i)
	    for(int j=0;j<9;++j)
	    arr[i][j]=ab.nextInt();
	    System.out.println(fn(arr));;
	}
	 }
}
