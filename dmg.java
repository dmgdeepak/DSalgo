import java.util.*;
import java.lang.*;
import java.io.*;
class dmg
 {
     public static void smallestwindow(int a,int b,Scanner ab)
{
  int n=ab.nextInt();
  String str="";
  int mid=a;
  while(str.compareTo("CORRECT")!=0)
  {
    mid=a+(b-a)/2;
    System.out.print(mid);
    str=ab.next();
    if(str.compareTo("TOO_SMALL")==0)
    a=mid+1;
    if(str.compareTo("TOO_BIG")==0)
    b=mid-1;
    if(str=="WRONG_ANSWER")
     System.exit(0);
  }
}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
    smallestwindow(ab.nextInt(),ab.nextInt(),ab);
	    //System.out.println();
	}
	 }
}
