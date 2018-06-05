import java.util.*;
class treemap
{
	public static void main(String args[])
	{
		TreeMap<Integer,Integer> treemaps=new TreeMap<Integer,Integer>(); //Storing two integer values
		treemaps.put(5,null);
		treemaps.put(1,null);
		treemaps.put(90,null);
		treemaps.put(17,null);
		Set set=treemaps.entrySet(); //Use set to get values in set (For iterator)
		Iterator i=set.iterator(); //set Iterator on set
		while(i.hasNext())
		{
			Map.Entry a=(Map.Entry)i.next(); //give key and value to a MapEntry
			System.out.println(a.getKey());
		}
		//or without Iterator
		for(Map.Entry<Integer,Integer> getdata :treemaps.entrySet())
		{
			System.out.println(getdata.getKey());
		}
	}
}