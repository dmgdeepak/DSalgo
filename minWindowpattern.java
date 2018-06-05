import java.util.*;
import java.lang.*;
import java.io.*;
class minWindowpattern
 {
  public static boolean matches(HashMap<Character,Integer> head,HashMap<Character,Integer> pat)
  {
    for(Map.Entry<Character,Integer> itr:pat.entrySet())
    {
      char x=itr.getKey();
      int i=itr.getValue();
      if(!head.containsKey(x) || head.get(x)<i)
      return false;
    }
    return true;
  }
 	public static void minWindow(char str[],char pat[])
 	{
    int n=str.length;
    int m=pat.length;
    int index=0,len=Integer.MAX_VALUE,start=0;
    int i=0;
    boolean flag=false;
    HashMap<Character,Integer> head=new HashMap<Character,Integer>();
    HashMap<Character,Integer> ptrn=new HashMap<Character,Integer>();
    for(char x:pat)
    {
      if(ptrn.containsKey(x))
      ptrn.put(x,ptrn.get(x)+1);
      else
      ptrn.put(x,1);
    }
    while(i<n)
    {
      char x=str[i];
      if(head.containsKey(x))
      head.put(x,head.get(x)+1);
      else
      head.put(x,1);
      flag=matches(head,ptrn);
      if(flag)
      {
        if((i-start)>=m-1 && (i-start)<len)
      {  index=start;
        len=i-start;
      }
        // remove characters from begainning
        if(start<i)
      {
        int t=head.get(str[start]),y=0;
        if(t<=1)
        head.remove(str[start]);
        else
        head.put(str[start],head.get(str[start])-1);
        if(head.containsKey(str[start]))
        y=head.get(str[start]);
              //  System.out.println("previous of "+str[start]+" "+t+" now "+y);
        ++start;

      }
      }
      if(!flag || start>=i)
      ++i;
    }
    if(len==Integer.MAX_VALUE)
    System.out.print("-1");
    else
    for(i=index;i<=index+len;++i)
    System.out.print(str[i]);
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
    minWindow(ab.next().toCharArray(),ab.next().toCharArray());
	    System.out.println();
	}
	 }
}
