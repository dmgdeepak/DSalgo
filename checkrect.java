import java.util.*;
import java.lang.*;
import java.io.*;
class checkrect
 {
 	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	   boolean flag=true;
	   Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	   int m=4;
		while(m-->0)
		{
			int x=ab.nextInt();
			if(map.containsKey(x))
				map.put(x,map.get(x)+1);
			else
				map.put(x,1);
		}
	   if(map.size()==2)
	   {
		   for(Map.Entry<Integer,Integer> itr:map.entrySet())
		   {
			   if(itr.getValue()!=2)
				   flag=false;
		   }
	   }
	   else
		   flag=false;
	    System.out.println(flag?"YES":"NO");
	}
	 }}