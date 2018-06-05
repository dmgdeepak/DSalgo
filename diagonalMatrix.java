import java.util.*;
import java.lang.*;
import java.io.*;
class diagonalMatrix
{
static void printMatrixDiagonal(int a[][], int n)
    {
        int i=0,j=0;
        if(n<=0) return ;
          System.out.print(a[i][j]+" ");
        while(i<n && j<n)
        {
          if(j<n-1)
          ++j;
          else
          ++i;
          while(i<n && j>=0)
          System.out.print(a[i++][j--]+" ");
          ++j;
          --i;
          if(i<n-1)
          ++i;
          else
          ++j;
          while(j<n && i>=0)
          System.out.print(a[i--][j++]+" ");
          ++i;
          --j;
        }
    }
    public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  while(t>0)
  {
    int n= sc.nextInt();
    int a[][] = new int[1000][1000];
    for(int i=0; i<n; i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j] = sc.nextInt();
      }
    }
    printMatrixDiagonal(a,n);
    System.out.println();
  t--;
  }
}}
