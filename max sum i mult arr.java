Idea is to first find sum of array .
Calculate default max sum.
Exclude i-1th element by removing it from sum and subtract this value from max sum and include i-1th element * (n-1 )
As we are rotating element that's why removing it and including with multiplied by n-1.


Code:

 int max_sum(int A[], int n)
    {
	int sum=A[0];
	int max_sum=0;
	for(int i=1;i<n;++i)
{	sum+=A[i];
    max_sum+=(i)*A[i];
}
int res=max_sum;
	for(int i=1;i<n;++i)
	{
	    max_sum=max_sum-(sum-A[i-1])+A[i-1]*(n-1);
	    res=Math.max(res,max_sum);
	}
	return res;
    }	