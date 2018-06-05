import java.util.*;
import java.lang.*;
import java.io.*;
class job
{
	int id;
	int deadline;
	int profit;
	job(int a,int b,int c)
	{
		id=a;
		deadline=b;
		profit=c;
	}
}
public class jobSchedule
{
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
int t=ab.nextInt();
while(t-->0)
{
		int n=ab.nextInt();
		ArrayList<job> arr=new ArrayList<job>();
		for(int i=0;i<n;++i)
		{
			job a=new job(ab.nextInt(),ab.nextInt(),ab.nextInt());
			arr.add(a);
		}
		Collections.sort(arr,(job j2,job j1)->
	{
		if(j1.deadline==j2.deadline)
			return j1.profit-j2.profit;
		return j1.deadline-j2.deadline;}
		);
		int profit=0,count=0;
		boolean visited[]=new boolean[n+1];
		for(job j:arr)
		{
			checkslot:
			for(int m=Math.min(n,j.deadline);m>0;--m)
			if(!visited[m])
			{
				visited[m]=true;
				++count;
				profit+=j.profit;
				break checkslot;
			}
		   // System.out.println(j.id+" "+j.deadline+" "+j.profit);
		}
		System.out.println(count+" "+profit);
}
	}
}
