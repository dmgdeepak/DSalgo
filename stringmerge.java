	import java.util.*;
import java.lang.*;
import java.io.*;
class stringmerge
 {
	 public static int maxmerge(String a,String b,int n,int m)
	 {
		 int max=0;
		 int len=0;
		 if(a.contains(b))
			 return n;
		 for(int i=m-1;i>=0;--i)
		 {
			 len=0;
			 int j=i,k=m-1;
			 while(j>=0 && a.charAt(j)==b.charAt(k))
			 {
				 --j;
				 --k;
				 ++len;
			 }
			 if(j==-1)
			 {max=Math.max(max,len);
			 break;}
		 }
		 for(int i=n-m;i<n;++i)
		 {
			 int j=i,k=0;
			 len=0;
			 while(j<n && a.charAt(j)==b.charAt(k))
			 {
				 ++j;
				 ++k;
				 ++len;
			 }
			 if(j==n)
			 {
				 max=Math.max(max,len);
				 break;
			 }
		 }
		 return n+m-max;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int m=ab.nextInt();
	    String a=new String(ab.next());
	    String b=new String(ab.next());
		if(n<=m)
	    System.out.println(maxmerge(b,a,m,n));
	else
	    System.out.println(maxmerge(a,b,n,m));
	}
	 }}