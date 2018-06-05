import java.util.*;
import java.lang.*;
class chefandmover
{
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	lp:
	while(t-->0)
	{
		int n=ab.nextInt();
		int d=ab.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=ab.nextInt();
			sum+=arr[i];
		}
		if(sum%n!=0)
		{
			System.out.println("-1");
			continue lp;
		}
		int mid=sum/n;
		sum=0;
		for(int i=0;i<n-d;i++)
		{
			while(arr[i]!=mid && arr[i+d]!=mid)
			{
				if(arr[i]>arr[i+d])
				{
					arr[i]-=1;
					arr[i+d]+=1;
				}
				else if(arr[i]<arr[i+d])
				{
					arr[i]+=1;
					arr[i+d]-=1;
				}
				sum++;
			}
		}
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				System.out.println("-1");
			continue lp;
			}
		}
		System.out.println(sum);
			
	}
	}
}