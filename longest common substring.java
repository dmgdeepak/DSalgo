     public static int MaxSuff(char x[],char y[],int n,int m)
     {
         int result=0;
         int dp[][]=new int[n+1][m+1];
         for(int i=0;i<=n;++i)
         {
             for(int j=0;j<=m;++j)
             {
                 if(i==0||j==0)
                 dp[i][j]=0;
                 else if(x[i-1]==y[j-1])
                 {dp[i][j]=dp[i-1][j-1]+1;
                     result=Math.max(result,dp[i][j]);
                 }
                 else
                 dp[i][j]=0;
             }
         }
         return result;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	     int m=ab.nextInt();
	    String str=ab.next();
	    String str2=ab.next();
	    System.out.println(MaxSuff(str.toCharArray(),str2.toCharArray(),n,m));
	}
	 }