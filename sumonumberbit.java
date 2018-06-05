	Given a positive integer N, Your task is to complete the function countValues which returns an integer denoting the count of all positive integers i such that
0 <= i <= n and n+i = n^i where ^ denotes a XOR operation.
	
	public int countValues(int n)
	{
            int unsetbits=0;
            while(n>0)
            {
                if((n&1)==0)
                ++unsetbits;
                n=n>>1;
            }
            int ans=1;
            ans<<=unsetbits;
            return ans;
	}