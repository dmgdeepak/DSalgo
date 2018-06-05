 public static int LCS(String a,String b,String c,int i,int j,int k)
	 {
		 int dp[][][]=new int[i+1][j+1][k+1];
		 for(int x=1;x<=i;++x)
		 {
			 for(int y=1;y<=j;++y)
			 {
				 for(int z=1;z<=k;++z)
				 {
					 if(a.charAt(x-1)==b.charAt(y-1) && a.charAt(x-1)==c.charAt(z-1))
						 dp[x][y][z]=dp[x-1][y-1][z-1]+1;
					 else
						 dp[x][y][z]=Math.max(dp[x-1][y][z],Math.max(dp[x][y][z-1],dp[x][y-1][z]));
				 }
			 }
		 }
		 return dp[i][j][k];
	 }