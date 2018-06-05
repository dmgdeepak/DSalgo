import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int pairDivisibleBy4(int arr[],int n)
	 {
		 //Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		 int count=0;
		 int hash[]=new int[4];
		 for(int i=0;i<n;++i)
		 {
			/* if(map.conatinsKey(arr[i]))
				 map.put(arr[i],map.get(arr[i])+1);
			 else
				  map.put(arr[i],1);*/
			  ++hash[arr[i]%4];
		 }
	/*	 for(Map.Entry<Integer,Integer> loop:map.entrySet())
		 {
			 int val=loop.getKey();
			 if(4-val==val)
			 {
				 
			 }
		 }*/
		 count+=arr[0]/2;
		 count+=Math.min(arr[1],arr[3]);
		 count+=arr[2]/2;
		 return count;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(pairDivisibleBy4(arr,n));
	}
	 }
}