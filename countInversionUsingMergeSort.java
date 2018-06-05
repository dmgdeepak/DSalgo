Idea is to use Modified Merge Sort algorithm so that whenever a change (Inversion)  is detected
Just mark that point and it is known than other than this slot values are sorted so inversions are mid-i;

 
 public static int countInversion(int arr[],int n)
{
	int temp[]=new int[n+1];
	return mergesort(arr,temp,0,n);
}
public static int mergesort(int arr[],int temp[],int l,int r)
{
int inv=0;
	if(l<r)
	{
		int mid=(r+l)>>1;
		inv=mergesort(arr,temp,l,mid);
		inv+=mergesort(arr,temp,mid+1,r);
		inv+=merge(arr,temp,l,mid+1,r);
	}
	return inv;
}
public static int merge(int arr[],int temp[],int l,int mid,int r)
{
	int i=l;
	int k=mid;
	int u=l;
	int inv=0;
	while(i<=mid-1 && k<=r)
	{
	if(arr[i]<=arr[k])
	temp[u++]=arr[i++];
	else
	{
		temp[u++]=arr[k++];
		inv+=mid-i;
	}
	}
	while(i<=mid-1)
	temp[u++]=arr[i++];
	while(k<=r)
	{
		temp[u++]=arr[k++];
	}
	for(i=l;i<=r;++i)
	arr[i]=temp[i];
	return inv;
}