	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int x=ab.nextInt();
	    int y=ab.nextInt();
	    int z=ab.nextInt();
	    int dp[]=new int[n+1];
	    Arrays.fill(dp,1,n+1,-1);
	    int start=Math.min(x,Math.min(y,z));
	    for(int i=start;i<=n;++i)
	    {
	        if(i>=x && dp[i-x]!=-1)
	        dp[i]=Math.max(dp[i],dp[i-x]+1);
	        if(i>=y && dp[i-y]!=-1)
	        dp[i]=Math.max(dp[i],dp[i-y]+1);
	        if(i>=z && dp[i-z]!=-1)
	        dp[i]=Math.max(dp[i],dp[i-z]+1);
	    }
	    System.out.println(dp[n]);
	}