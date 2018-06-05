import java.util.*;
class generate1
{
	static void generatestring(int k,int arr[],int n)
	{
		if(k==n)
		{
			for(int c:arr)
				System.out.print(c);
				System.out.print(" ");
			return;
		}
		if(arr[n-1]==0)
		{
			arr[n]=0;
			generatestring(k,arr,n+1);
			arr[n]=1;
			generatestring(k,arr,n+1);
		}
		if(arr[n-1]==1)
		{
			arr[n]=0;
			generatestring(k,arr,n+1);
		}
	}
	static void generate(int k)
	{
		int arr[]=new int[k];
		arr[0]=0;
		generatestring(k,arr,1);
		arr[0]=1;
		generatestring(k,arr,1);
	}
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		int n=ab.nextInt();
		generate(n);
	}
}