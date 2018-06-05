http://practice.geeksforgeeks.org/problems/find-patterns/0
import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static String replace(int start,String str,String str2)
     {
         int n=str.length();
         int m=str2.length();
         StringBuffer strn=new StringBuffer(str);
         int i=start,j=0;
         while(i<n && j<m)
         {
             if(strn.charAt(i)==str2.charAt(j))
             {
                 strn.setCharAt(i,'*');
                 ++j;
             }
             ++i;
         }
         return String.valueOf(strn);
     }
     public static int patternCount(String str,String str2)
     {
         String pat=new String();
         int c=0;
         for(int i=0;i<str2.length();++i)
        { pat+=str2.charAt(i);
            if(i<str2.length()-1)
            pat+=".*";
        }
        // System.out.println(pat);
         Pattern p=Pattern.compile(pat);
         st:
         while(true)
         {Matcher m=p.matcher(str);
         while(m.find())
         {
            str=replace(m.start(),str,str2);
             //System.out.println(m.end());
             ++c;
             continue st;
         }
             break st;
         }
         return c;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(patternCount(ab.next(),ab.next()));
	}
	 }
}