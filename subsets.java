import java.util.*;
import java.lang.*;
import java.io.*;
class subsets
 {
   public static void subsetbyBits(int arr[],int n)
   {
     SortedSet<String> set=new TreeSet<String>();
     for(int i=0;i<1<<n;++i)
     {
       boolean flag=false;
       String str=new String("(");
       for(int j=0;j<n;++j)
       {
         if((i&(1<<j))>0)
         {
           if(flag)
           str+=' ';
           str+=String.valueOf(arr[j]);
           flag=true;
         }
       }
       str+=')';
       set.add(str);
     }
     for(String str:set)
     System.out.print(str);
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
      subsetbyBits(arr,n);
	    System.out.println();
	}
	 }
}
