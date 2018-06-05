import java.util.*;
import java.lang.*;
import java.io.*;
class equalBracketPos
 {
     public static int equalBracketPoint(String str)
     {
         int n=str.length();
        int open[]=new int[n];
        int cls[]=new int[n];
        open[0]=(str.charAt(0)=='(')?1:0;
        cls[n-1]=(str.charAt(n-1)==')')?1:0;
        for(int i=1;i<n;++i)
        {
            if(str.charAt(i)=='(')
            {
                open[i]=1+open[i-1];
            }
            else
            open[i]=open[i-1];
        }
         for(int i=n-2;i>=0;--i)
        {
            if(str.charAt(i)==')')
            {
                cls[i]=1+cls[i+1];
            }
            else
            cls[i]=cls[i+1];
        }
       /* for(int x:open)
        System.out.print(x);
        System.out.println();
        for(int x:cls)
        System.out.print(x); */
        for(int i=0;i<n;++i)
        {
            if(open[i]==cls[i])
            return i;
        }
        return -1;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(equalBracketPoint(ab.next()));
	}
	 }
}
