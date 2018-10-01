import java.util.*;
import java.lang.*;
import java.io.*;
class subsetpartitiongreedy
 {
	 public static String subset(int x,int n)
	 {
		 ArrayList<Integer> a=new ArrayList<Integer>();
		 ArrayList<Integer> b=new ArrayList<Integer>();
		 int s1=0,s2=0;
		 int p=n;
		 n=1;
		 //only works in descending 
		 while(n<=p)
		 {
			 if(n!=x)
			 {
				 if(s1<=s2)
				 {a.add(n);
			 s1+=n;
				 }
				 else
				 {	 b.add(n);
			 s2+=n;
				 }
			 }
			 ++n;
		 }
		 if(s1!=s2)
			 return "impossible";
		 String str=new String("");
		// System.out.println(a+"\n"+b);
		 for(int i=1;i<=p;++i)
		 {
			 
			 if(a.contains(Integer.valueOf(i)))
			 {
			//System.out.println("cdf");	 
				 str+='0';}
			 else if(b.contains(i))
				 str+='1';
			 else
				 str+='2';
		 }
		 return str;
	 }
 public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int x=ab.nextInt();
	    int n=ab.nextInt();
	    System.out.println(subset(x,n));
	}
	 }
}