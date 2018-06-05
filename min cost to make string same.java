  public static int LCS(char X[],char Y[],int m,int n)
     {
          int L[][]=new int[m+1][n+1];
 
    for (int i=0; i<=m; i++)
    {
        for (int j=0; j<=n; j++)
        {
            if (i == 0 || j == 0)
                L[i][j] = 0;
 
            else if (X[i-1] == Y[j-1])
                L[i][j] = L[i-1][j-1] + 1;
 
            else
                L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
        }
    }
 
    return L[m][n];
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
	    int lcs=LCS(str.toCharArray(),str2.toCharArray(),str.length(),str2.length());
	    System.out.println(n*(str.length()-lcs)+m*(str2.length()-lcs));
	}
	 }

