static int dp[]=new int[100001];
     public static int check(int n)
     {
         if(dp[n]>=n)
         return dp[n];
         for(int i=2;i<=n;++i)
         {
             dp[i]=Math.max(dp[i/2]+dp[i/3]+dp[i/4],i);
         }
         return dp[n];
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	
     dp[1]=1;
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println(check(n));
	}
	 }