import java.util.*;
import java.lang.*;
import java.io.*;
class mapll
 {
	 public static void main(String args[])
	 {
		 HashMap<Integer,LinkedList<String>> map=new HashMap<Integer,LinkedList<String>>();
		 Scanner ab=new Scanner(System.in);
		 int n=5;
		 while(n-->0)
		 {
			 String str=ab.next();
			 int len=str.length();
			 if(map.containsKey(len))
			 {
				 LinkedList<String> l=map.get(len);
				 l.add(str);;
				 map.put(len,l);
			 }
			 else
			 {
				  LinkedList<String> l=new LinkedList<String>();
				  l.add(str);
				 map.put(len,l);
			 }
		 }
		for(Map.Entry<Integer,LinkedList<String>> itr:map.entrySet())
		{
			System.out.println(itr.getKey()+" ");
			 LinkedList<String> l=itr.getValue();
			 Iterator<String> it=l.listIterator();
			 while(it.hasNext())
			 {
				 System.out.println(it.next());
			 }
		}
		 
 }}