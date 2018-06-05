import java.util.*;
import java.lang.*;
import java.io.*;
class max1bychange0sliding
 {
	 public static int max1(int arr[],int n,int k)
	 {
		int max=0;
		int lastindex=0;
		for(int i=0;i<n;++i)
		{
			if(arr[i]==0)
			{
				if(k>0)
				{--k;;}
				else
				{
					for(int j=lastindex;j<i;++j)
					{
						if(arr[j]==0){
				lastindex=j+1;
					System.out.println("Last index for "+i+" "+lastindex);
				break;
						}
					}
				}
			}
				max=Math.max(max,i-lastindex+1);
			System.out.println(i+" "+max);
		}
		return max;
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
	    System.out.println(max1(arr,n,ab.nextInt()));
	}
	 }
}