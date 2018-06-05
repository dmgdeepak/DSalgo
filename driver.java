import java.util.*;
class sortcls
{
public int id;
public char val;
public sortcls(int x,char b)
{
	id=x;
	val=b;
}
public void print()
{
	System.out.println("id= "+this.id+" val "+this.val);
}
}
class driver
{
	public static void main(String args[])
	{
	Scanner ab=new Scanner(System.in);
	int n;
	System.out.println("Enter limit");
	n=ab.nextInt();
	sortcls [] arr=new sortcls[n];
	for(int i=0;i<n;i++)
	{
		int temp1=ab.nextInt();;
		char temp2=ab.next().charAt(0);;
		arr[i]=new sortcls(temp1,temp2);
	}
	for(int i=0;i<n;i++)
		arr[i].print();
	
	for(int i=1;i<n;i++)
	{
		sortcls abc=new sortcls(arr[i].id,arr[i].val); //temporary variable to hold data
		int j=i-1;
		while(j>=0 && abc.id<arr[j].id)
		{
			arr[j+1].id=arr[j].id;
			arr[j+1].val=arr[j].val;
			j--;
		}
		arr[j+1].id=abc.id;
			arr[j+1].val=abc.val;
	}	
	for(int i=0;i<n;i++)
		arr[i].print();
	
	
		
}}