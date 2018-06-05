import java.util.*;
import java.lang.*;
import java.io.*;
class colmExcel
 {
   public static void colmn(long n)
   {
     String str=new String();
     long res=-1;
     while(n>0)
      {
        res=n%26;
        if(res!=0)
        {
          str+=(char)('A'+(res-1));
          //System.out.println((char)('A'+(res-1)));
        }
        else
        {
          str+=(char)('Z');
        }
        n/=26;
        if(res==0)
        --n;
      }
      for(int i=str.length()-1;i>=0;--i)
      System.out.print(str.charAt(i));
      //return str;
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    long n=ab.nextLong();
      colmn(n);
	    System.out.println();
	}
	 }
}
