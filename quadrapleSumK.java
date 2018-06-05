import java.util.*;
import java.lang.*;
import java.io.*;
class quadrapleSumK
 {
 public static void getQuad(int arr[],int n,int k)
 {
   Map<Integer,String> map=new HashMap<Integer,String>();
   for(int i=0;i<n;++i)
   for(int j=0;j<n;++j)
   {
     int sum=arr[i]+arr[j];
     String str=new String(i+" "+j);
     map.put(sum,str);
   }
   for(Map.Entry<Integer,String> itr:map.entrySet())
   {
     int val=itr.getKey();
     String  str=itr.getValue();
     int a=str.split()
     if(map.containsKey(k-val))
     {
       String mapval=map.get(k-val);

       if()
       System.out.print(str+" "++"$");
     }
   }
 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
      getQuad(arr,n,k);
	    System.out.println();
	}
	 }
}
