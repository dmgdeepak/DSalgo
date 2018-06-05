import java.util.*;
import java.lang.*;
import java.io.*;
class jam
 {
	public static int escape(int n,int val[])
	{
		Comparator<HashMap<Character,Integer>> comp=new Comparator<HashMap<Character,Integer>>()
		{
			@Override
			public int compare(HashMap<Character,Integer> a,HashMap<Character,Integer> b)
			{
				Map.Entry<Character,Integer> entry1=a.entrySet().iterator().next();
				int x=entry1.getValue();
				Map.Entry<Character,Integer> entry=b.entrySet().iterator().next();
				int y=entry.getValue();
				return x-y;
			}
		};
		PriorityQueue<HashMap<Character,Integer>> pq=new PriorityQueue<HashMap<Character,Integer>>(comp);
		for(int i=0;i<n;++i)
		{
		    char x=(char)(i+'A');
		    HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		    h.put(x,val[i]);
			pq.offer(h);
		}
		while(!pq.isEmpty())
		{
			 HashMap<Character,Integer> h=pq.poll();
			Map.Entry<Character,Integer> entry1=h.entrySet().iterator().next();
				int value=entry1.getValue();
				int key=entry1.getkey();
				pq.offer()
		}
		
	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int val[]=new int[n];
	    for(int i=0;i<n;++i)
	    val[i]=ab.nextInt();
	escape(n,val);
	    System.out.println();
	}
	 }
}