import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int smallestdistinct(String str)
     {
        // System.out.print(str);
         boolean visited[]=new boolean[256];
        // Arrays.fill(visited,false);
         int hash[]=new int[256];
         int count=0,start=0,len=Integer.MAX_VALUE,index=-1;
         for(int i=0;i<str.length();++i)
         {
             if(!visited[str.charAt(i)])
             {
                 visited[str.charAt(i)]=true;
                 ++count;
             }
         }
         int compl=0;
         for(int i=0;i<str.length();++i)
         {
             ++hash[str.charAt(i)];
             if(hash[str.charAt(i)]==1)
             ++compl;
             if(compl==count)
             {
                 while(hash[str.charAt(start)]>1)
                 {
                     --hash[str.charAt(start)];
                     ++start;
                 }
                 int windowlen=i-start+1;
                 if(len>windowlen)
                 {
                     len=windowlen;
                     index=start;
                 }
             }
         }
         return len;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(smallestdistinct(ab.next()));
	}
	 }
}