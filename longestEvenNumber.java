import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static void longestEvenNumber(String str)
	 {
		 //count Sort
		 int len=str.length();
		 int count[]=new int[10];
		 for(int i=0;i<len;++i)
		 {
			 ++count[str.charAt(i)-'0'];
		 }
		 for(int i=1;i<10;++i)
			 count[i]+=count[i-1];
		 int op[]=new int[len];
		 for(int i=0;i<len;++i)
		 {
			 op[count[str.charAt(i)-'0']-1]=str.charAt(i)-'0';
			 --count[str.charAt(i)-'0'];
		 }
		 int ev=-1;
		 //Look for next even number and swap with last value
		 if(((op[0])&1)!=0)
		 for(int i=1;i<len;++i)
		 {
		    // System.out.println("lop");
			 if((op[i]&1)==0)
			 {
				 ev=op[i];
				 op[i]=-1;
				 break;
			 }
		 }
		 for(int i=len-1;i>=0;--i)
		 {
			 if(op[i]!=-1)
		 System.out.print(op[i]);
		 }
		 if(ev!=-1)
			 System.out.print(ev);
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
		longestEvenNumber(ab.next());
	    System.out.println();
	}
	 }
}