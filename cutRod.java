int cutRod(int price[],int length)
{
	int val[]=new int[length+1];
	val[0]=0;
	for(int i=1;i<=length;++i)
	{
		int max=Integer.MIN_VALUE;
		for(int j=0;j<i;++j)
			max=Math.max(max,price[j]+val[i-j-1]);
		val[i]=max;
	}
	return val[length];
}