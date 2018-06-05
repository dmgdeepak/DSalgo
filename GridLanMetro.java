import java.io.*;
import java.util.*;
import javafx.util.Pair.*;
public class GridLanMetro {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
		Map<Integer,Pair<Integer,Integer>> map =new HashMap<Integer,Pair<Integer,Integer>>();
		int n=ab.nextInt();
		int m=ab.nextInt();
		int k=ab.nextInt();
		int count=0;
		while(k-->0)
		{
			int x=ab.nextInt();
			int s=ab.nextInt();
			int e=ab.nextInt();
			if(!map.contains(x))
			{
				map.add(x,new Pair<Integer,Integer>(s,e));
			}
			else
			{
				Pair<Integer,Integer> temp=map.get(x);
				int key=Math.min(temp.getKey(),s);
				int value=Math.max(temp.getValue(),e);
				map.add(x,new Pair<Integer,Integer>(key,value));
			}
		}
		for(Map.Entry<Integer,Pair<Integer,Integer>> temp:map.entrySet())
		{
			Pair<Integer,Integer> x=temp.getValue();
			int s=x.getKey();
			int e=x.getValue();
			count+=e-s;
		}
		System.out.println(n*m-count);
    }
}