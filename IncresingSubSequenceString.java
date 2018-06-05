abcdapzfqh - 6

idea is to loop from 0 to i and check if it is following increasing subsequence 
Then change value of dp

public static int IncresingSubSequence(String str)
	 {
		 int len=str.length();
		 int dp[]=new int[len];
		 int m=Integer.MIN_VALUE;
		 for(int i=1;i<len;++i)
		 {
			 for(int j=0;j<i;++j)
			 {
				 if(str.charAt(i)>str.charAt(j))
				 { dp[i]=Math.max(dp[i],dp[j]+1);
			 m=Math.max(m,dp[i]);
			 }
			 }
		 }
		 return m+1;
	 }