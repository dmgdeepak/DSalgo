//LIS NLOGN
// Ceil Index is used to find index of immediate larger element
public static int getindex(int key,int l,int r,int table[])
{
	while(r-l>1)
	{
		int mid=l+(r-l)/2;
		if(table[mid]>=key)
			r=mid;
		else
			l=mid;
	}
	return r;
}
public static int LIS(int arr[],int n)
{
	int table[]=new int[n];
	table[0]=arr[0];
	int len=0;
	for(int i=1;i<n;++i)
	{
		if(arr[i]<table[0])
			table[0]=arr[i];
		else if(arr[i]>table[len])
		{
			table[++len]=arr[i];
		}
		else
		{
			table[getindex(arr[i],-1,n-1,table)]=arr[i];
			//l=-1 ,r=n-1 as we are trying to get index when size is n so n-1 used
		}
	}
	return len+1;
}