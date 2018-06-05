import java.util.*;
class merge
{
	public static void merge_Sort(int[] arr,int p,int q)
	{
		int x;
		if(p<q)
		{
			x=(p+q)/2;
			merge_Sort(arr,p,x);
			merge_Sort(arr,x+1,q);
			mergeme(arr,p,q,r);
		}
	}
	public static void mergeme(int[] arr,int p,int q,int r)
	{
		int m,n,i;
		m=q-p+1;
		n=r-q;
		int []larr=new int[m];
		int []rarr=new int[n];
		for(i=0;i<m;i++)
			larr[i]=arr[i];
	}
	public static void main(String args[])
	{
		int n,i,key;
		System.out.println("ENter range");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		int []arr=new int[n];
		for(i=0;i<n;i++)
			arr[i]=ab.nextInt();
	}
}