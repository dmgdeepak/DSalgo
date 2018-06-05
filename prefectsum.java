it is same like subset sum problem

We have modified that approach by having int value



Code memoized:



public static int fn(int a[],int i,int n,int sum,int memo[][])

 	{

 	    if(sum<0)

 	    return 0;

 	    if(memo[i][sum]!=0)

 	    return memo[i][sum];

 	    if(sum==0)

        {

            return memo[i][sum]=1;}

 	    if(i==n ) return 0;

 	    int s=1;

            return memo[i][sum]=fn(a,i+1,n,sum,memo)+fn(a,i+1,n,sum-a[i],memo);



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

	    int k=ab.nextInt();

	    int memo[][]=new int[n+1][k+1];

	    System.out.println(fn(arr,0,n,k,memo));

	}


	 }



Code DP:



 	public static int fn(int a[],int n,int sum)

 	{

 	   int dp[][]=new int[n+1][sum+1]; // denotes no. of subset till n having sum=sum

 	   for(int i=0;i<=n;++i)

 	   dp[i][0]=1;

 	   for(int i=1;i<=n;++i)

 	   {

 	       for(int j=1;j<=sum;++j)

 	       {

 	           dp[i][j]=dp[i-1][j];//do not include

 	           if(a[i-1]<=j)

 	           dp[i][j]+=dp[i-1][j-a[i-1]]; // include sum

 	       }

 	   }

 	   return dp[n][sum];

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

	    int k=ab.nextInt();

	    int memo[][]=new int[n+1][k+1];

	    System.out.println(fn(arr,n,k));

	}

	 }

}
