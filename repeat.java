import java.util.*;
import java.lang.*;
import java.io.*;
class repeat
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
		int max=0;
	    int n=ab.nextInt();
	    HashMap<Integer,Integer> hmap =new HashMap<Integer,Integer>();
		while(n-->0)
		{
			int temp1=ab.nextInt();
			int count=1;
			if(hmap.containsKey(temp1))
				count+=hmap.get(temp1);
			hmap.put(temp1,count);
		}
		for(int c:hmap.values())
		{
			max+=(c/2);
		}
		System.out.println(2*max);
	}
	 }
}