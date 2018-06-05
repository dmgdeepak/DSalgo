import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int longestCons(String str)
	 {
		 char cur='a';
		 int max=0;
		 for(int i=0;i<str.length();++i)
		 {
			 if(str.charAt(i)<=cur+1)
			 {
				 max=Math.max(max,i);
				 if(str.charAt(i)==cur+1)
				 cur=cur+1;
			 }
		 }
		 return max;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(longestCons(ab.next()));
	}
	 }
}