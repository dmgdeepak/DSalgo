import java.util.*;
class instsort
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
		for(i=1;i<n;i++)
		{
			key=arr[i];
			int j=i-1;
			while(j>=0 &&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}