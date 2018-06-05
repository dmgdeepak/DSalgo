import java.util.*;
import java.lang.*;
import java.io.*;
class in
{
  int s,e;
  in(int x,int y)
  {
    s=x;
    e=y;
  }
}
class mergeOverlapInterval
 {
 	public static void fn(ArrayList<in> a,int n)
 	{
    Collections.sort(a,(in m,in b)->
    {
      return b.s-m.s;
    });
    int index=0;
    for(int i=0;i<n;++i)
    {
      if(index>0 && a.get(index-1).s<=a.get(i).e)
      {while(index>0 && a.get(index-1).s<=a.get(i).e)
      {
        in x=a.get(index-1);
        x.s=Math.min(x.s,a.get(i).s);
        x.e=Math.max(x.e,a.get(i).e);
        a.set(index-1,x);
        --index;
      }}
      else
      a.set(index,a.get(i));

      ++index;
    }
    for(int i=index-1;i>=0;--i)
    System.out.print(a.get(i).s+" "+a.get(i).e+" ");
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    ArrayList<in> a=new ArrayList<in>();
	    for(int i=0;i<n;++i)
	    a.add(new in(ab.nextInt(),ab.nextInt()));
      fn(a,n);
	    System.out.println();
	}
	 }
}
