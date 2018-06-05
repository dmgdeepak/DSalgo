import java.util.*;
import java.lang.*;
import java.io.*;
class subsetsum
 {  public static TreeMap<Integer,Integer> treemap=new TreeMap<Integer,Integer>();
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	 int x=ab.nextInt();
	 int arr[]=new int[x];
	 for(int o: arr)
	 {
	     arr[o]=ab.nextInt();
	 }
	 check(arr,x,0,0);
	 for(Map.Entry<Integer,Integer> mapentry : treemap.entrySet())
	 System.out.print(mapentry.getKey());
	 System.out.println("");
	}
	 }
	 public static void check(int a[],int n,int sum,int l)
	 {
	     if(l==n)
	     {
	         treemap.put(sum,null);
	         return;
	         
	     }
	         check(a,n,sum,l+1);
	         check(a,n,sum+a[l],l+1);
	     
	 }
}