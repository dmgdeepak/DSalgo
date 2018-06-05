import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;
class isSubstring
 {
   public static boolean isSubstring(String pattern,String str)
   {
     String ptrn=new String();
     for(int i=0;i<pattern.length()-1;++i)
     {
       ptrn+=String.valueOf(pattern.charAt(i)+".*");
     }
     ptrn+=String.valueOf(pattern.charAt(pattern.length()-1));
    // System.out.println(ptrn);
     Pattern p=Pattern.compile(ptrn);
     Matcher m=p.matcher(str);
     return m.find();
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(isSubstring(ab.next(),ab.next())?"1":"0");
	}
	 }
}
