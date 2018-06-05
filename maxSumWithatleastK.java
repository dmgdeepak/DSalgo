/*Idea is to find maximum subarray first
find sum for 1st k elements 
loop from k to n
Check if sum from last k elements till loop variable are max or not
Check by including maximum subarray size of i-k i.e. more than k elements
*/

static int maxSumWithatleastK(int a[], int n, int k)
{
	int sum=a[0];
	int max_sum[]=new int[n];
	max_sum[0]=a[0];
	for(int i=1;i<n;++i)
	{
		max_sum[i]=Math.max(max_sum[i-1]+a[i],a[i]);
	}
	for(int i=1;i<k;++i)
	{
		sum+=a[i];
	}
	int result=sum;
	for(int i=k;i<n;++i)
	{
		sum=sum+a[i]-[i-k];
		result=Math.max(result,Math.max(sum,sum+max_sum[i-k]));
	}
	return result;
}