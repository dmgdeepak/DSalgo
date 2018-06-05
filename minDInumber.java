import java.util.*;
import java.lang.*;
import java.io.*;
class minDInumber
 {
	 public static String DI(String s)
	 {
		 Stack<Integer> stk=new Stack<Integer>();
		 String res="";
		 for(int i=0;i<=s.length();++i)
		 {
			 stk.push(i+1);
			 if(i==s.length() ||s.charAt(i)=='I')
			 {
				 while(!stk.isEmpty())
				 {
					 res+=String.valueOf(stk.pop());
				 }
			 }
		 }
		 return res;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(DI(ab.next()));
	}
	 }
}