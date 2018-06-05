import java.util.*;
import java.lang.*;
import java.io.*;
class checkrect2
 {
 	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	   boolean flag=true;
	   int arr[]=new int[4];
	   int i=0;
		while(i<4)
		{
			arr[i++]=ab.nextInt();
		}
	   Arrays.sort(arr);
	   if(arr[0]!=arr[1] || arr[2]!=arr[3])
		   flag=false;
	    System.out.println(flag?"YES":"NO");
	}
	 }}