import java.util.*;
class gfg
{
public static void main(String args[])
{
Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
for(int k=1;k<=t;++k)
	{
	System.out.println("Case # "+k+":");
	int n,p;
	n=ab.nextInt();
	p=ab.nextInt();
	int a[n]=new int[n];
	int count,num=0;
	for(int i=0;i<n;++i)
		a[i]=ab.nextInt();
	int arr[n][p]=new int[n][p];
	for(int i=0;i<n;++i )
		{
		for(int j=0;j<p;++j)
			arr[i][j]=ab.nextInt();
		}
	int j=0,l=0;
	count=0;
	for(int i=0;i<p;++i)
		{
		num=Math.ceil(arr[0][i]*1.0/a[l]);
		System.out.println("num="+num);
		boolean flag=true;
		
		for(int j=0;j<n;++j)
			{
			float val=arr[j][i]/(num*a[j]*1.0);
			System.out.println("arr="+arr[j][i]+" a="+a[j]);
			System.out.println(fixed);
			if(val>=.90 &&  val<=1.10)
				{
				System.out.println("yes") ;
				}
			else
				{
				System.out.println("val %="+val+);
				flag=false;
				//break;
				}
			}
		l++;
		if(flag)
			++count;
		}
	System.out.println("count="+count+);
	
	}
}}