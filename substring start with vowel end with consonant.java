import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static SortedSet<String> s=new TreeSet<String>();
     public static boolean isVowel(String str,int index)
     {
         char x=str.charAt(index);
         if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
         return true;
         return false;
     }
     public static void generatestring(String str)
     {
         for(int i=0;i<str.length();++i)   
         {
             if(isVowel(str,i))
             {
                 for(int j=(str.length()-1);j>=i;--j)
                 {
                     if(!isVowel(str,j))
                     {
                         String t=str.substring(i,j+1);
                         s.add(t);
                         for(int k=1;k<t.length()-1;++k)
                         {
                             StringBuffer sb=new StringBuffer(t);
                             sb.deleteCharAt(k);
                             generatestring(String.valueOf(sb));
                         }
                     }
                 }
             }
         }
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	
	int t=ab.nextInt();
	while(t-->0)
	{
	    s.clear();
	    String str=new String(ab.next());
	    generatestring(str);
	    
	    if(!s.isEmpty())
	    {for(String f:s)
	    System.out.print(f+" ");
	   System.out.println();}
	   else
	   System.out.println("-1");
	}
	 }
}