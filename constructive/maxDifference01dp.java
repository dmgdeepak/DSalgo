import java.util.*;
import java.lang.*;
import java.io.*;
class maxDifference01dp
 {
	 public static int maxDifference(String str)
	 {
		 int len=str.length();
		 int arr[]=new int[len];
		 int max=-1,temp=0;
		 for(int i=0;i<len;++i)
		 {
			 if(str.charAt(i)=='1')
				 arr[i]=-1;
			 else
				 arr[i]=1;
		 }
		 for(int i=0;i<len;++i)
		 {
			 temp+=arr[i];
			 if(temp<=0)
			 {
				 temp=0;
			 }
			 else
				 max=Math.max(max,temp);
		 }
		 return max;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(maxDifference(ab.next()));
	}
	 }
}