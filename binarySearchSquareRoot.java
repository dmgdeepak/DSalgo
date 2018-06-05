long floorSqrt(long x)
	 {
		long res=-1;
		if(x<=1)
		return x;
		long lo=1,high=x;
		while(lo<=high)
		{
		    long mid=(lo+high)>>1;
		    if(mid*mid==x)
		    return mid;
		     if(mid*mid<=x)
		     {
		         res=mid;
		         lo=mid+1;
		     }
		     else
		     high=mid-1;
		}
		return res;
	 }
