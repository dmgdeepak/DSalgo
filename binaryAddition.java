import java.util.*;
import java.lang.*;
import java.io.*;
class binaryAddition
 {
   public static StringBuffer addZero(StringBuffer a,int len)
   {
     String str=new String();
     while(len-->0)
     {
       str+='0';
     }
     a.insert(0,str);
     return a;
   }
   public static StringBuffer addBinary(StringBuffer a,StringBuffer b)
   {
     if(a.length()<b.length())
     {
       a=addZero(a,b.length()-a.length());
     }
     if(b.length()<a.length())
     b=addZero(b,a.length()-b.length());
     //System.out.println(a);
     //System.out.println(b);
     //now add binary strings
     StringBuffer res=new StringBuffer();
     int carry=0;
     for(int i=a.length()-1;i>=0;--i)
     {
       res.append(String.valueOf((carry+a.charAt(i)+b.charAt(i)-'0'-'0')%2));
       carry=(carry+a.charAt(i)+b.charAt(i)-'0'-'0')/2;
    //   System.out.println("carry "+carry);
     }
     if(carry==1)
     res.append('1');
     return res.reverse();
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(addBinary(new StringBuffer(ab.next()),new StringBuffer(ab.next())));
	}
	 }
}
