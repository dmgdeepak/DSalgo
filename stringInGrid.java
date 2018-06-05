import java.util.*;
import java.lang.*;
import java.io.*;
class stringInGrid
 {
   public static boolean isValid(int x,int y,int n,int m)
   {
     return (x>=0 && y>=0 && x<n && y<m);
   }
 	public static void fn(char a[][],int n,int m,char s[])
 	{
      int dr[]={-1,-1,-1,1,0,1,1,0};
      int dc[]={-1,0,1,1,1,0,-1,-1};
      int t=s.length;
      boolean flag=false;
        for(int i=0;i<n;++i)
        {
          for(int j=0;j<m;++j)
          {
            if(a[i][j]==s[0])
            for(int k=0;k<8;++k)
            {
              int x=i+dr[k],y=j+dc[k];
              int l=1;
              while(isValid(x,y,n,m))
              {
                if(l>=t)
                break;
                if(a[x][y]!=s[l])
                break;
                x+=dr[k];
                y+=dc[k];
                ++l;
              }
              if(l==t)
               {
                   flag=true;
                   System.out.print(i+" "+j+", ");
                 break;}
            }
          }
        }
        if(!flag)
        System.out.print("-1");
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
      fn(arr,n,m,ab.next().toCharArray());
	    System.out.println();
	}
	 }
}
