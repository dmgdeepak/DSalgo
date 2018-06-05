import java.util.*;
class bubble
{
	public static void main(String args[])
	{
		int n,i,key;
		System.out.println("ENter range");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		int []arr=new int[n];
		for(i=0;i<n;i++)
			arr[i]=ab.nextInt();
		for(i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					key=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=key;
				}
			}
			for(int k=0;k<n;k++)
			System.out.print(arr[k]+" ");
		
			System.out.println("");
		}
			System.out.println("now array ");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}