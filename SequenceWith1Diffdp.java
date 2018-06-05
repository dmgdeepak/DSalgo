	Idea is to move to  every possible sequence and increment 1 if absolute difference is 1.
	
	 public static int SequenceWith1Diff(int arr[],int n)
	 {
		 int dp[]=new int[n];
		 int m=1;
		 for(int i=1;i<n;++i)
			 for(int j=0;j<n;++j)
			 {
				 if(Math.abs(arr[i]-arr[j])==1)
				 { dp[i]=Math.max(dp[i],dp[j]+1);
				 m=Math.max(m,dp[i]);
			 }
			 }
			 return m;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(SequenceWith1Diff(arr,n));
	}
	 }
