import java.util.*;
import java.lang.*;
import java.io.*;
class removeComments
 {
   public static void commentRemove(String str)
   {
    //   System.out.println(str);
     int n=str.length();
     for(int i=0;i<n;++i)
     {
       if(str.charAt(i)=='/')
       {
         if(str.charAt(i+1)=='/')
         i=str.indexOf("\\n",i+1)+1;
         else if(str.charAt(i+1)=='*')
         i=str.indexOf("*/",i+1)+1;
         else
         System.out.print(str.charAt(i));
       }
       else
        System.out.print(str.charAt(i));
     }
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=Integer.parseInt(ab.nextLine());
	while(t-->0)
	{
    commentRemove(ab.nextLine());
	    System.out.println();
	}
	 }
}
