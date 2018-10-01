public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	   int m=Integer.MAX_VALUE,n=Integer.MAX_VALUE;
	   int c1=0,c2=0;
	   for(int x:a)
	   {
	       if(c1==0|| x==m)
	       {
	           ++c1;
	           m=x;
	       }
	       else if(c2==0 || x==n)
	       {
	           ++c2;
	           n=x;
	       }
	       else
	       {
	           --c1;
	           --c2;
	       }
	   }
	   c1=c2=0;
	    for(int x:a)
	   {
	       if(x==m)
	       ++c1;
	       else if(x==n)
	       ++c2;
	   }
	   if(c1>a.size()/3) return m;
	   if(c2>a.size()/3) return n;
	   return -1;
	}
}
