import java.util.*;
import java.lang.*;
import java.io.*;
class pair
{
    int val;
    char arrow;
    pair(int x,char y)
    {
        this.val=x;
        this.arrow=y;
    }
   public int getval()
    {
        return this.val;
    }
   public char getarrow()
    {
        return this.arrow;
    }
}
class GFG
 {
     public static void LCS(pair mat[][],String str,String str2,int l1,int l2)
     {
         for(int i=0;i<=l1;i++)
         {
             for(int j=0;j<=l2;++j)
             {
                 if(i==0 || j==0)
                 mat[i][j]=new pair(0,'n');
                 else
                 {
                     if(str.charAt(i-1)==str2.charAt(j-1))
                    {
                         mat[i][j]=new pair(mat[i-1][j-1].getval()+1,'e');
                    }
                     else
                     {
                         int val=mat[i-1][j].getval();
                         int val2=mat[i][j-1].getval();
                          mat[i][j]=new pair(Math.max(val,val2),'n');
                     }
                 }
             }
         }
     }
     public static void print(pair mat[][],int l1,int l2)
     {
         for(int i=1;i<=l1;++i)
         {
             for(int j=1;j<=l2;++j)
             {
                 System.out.print(mat[i][j].getval()+" "+mat[i][j].getarrow()+" ");
             }
             System.out.println();
         }
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    String str=ab.next();
	    String str2=ab.next();
	    int l1=str.length();
	    int l2=str2.length();
	    pair mat[][]=new pair[l1+1][l2+1];
	    LCS(mat,str,str2,l1,l2);
	    print(mat,l1,l2);
	}
	 }
}