/*
 Construct a sum matrix S[R][C] for the given M[R][C].
     a)    Copy first row and first columns as it is from M[][] to S[][]
     b)    For other entries, use following expressions to construct S[][]
         If M[i][j] is 1 then
            S[i][j] = min(S[i][j-1], S[i-1][j], S[i-1][j-1]) + 1
         Else /*If M[i][j] is 0
            S[i][j] = 0

*/
public static int maxmatrixwith1(boolean mat[][],int r,int c)
{
	int s[][]=new int[r][c];
	int max=0;
	for(int i=0;i<r;++i)
	{
		s[i][0]=(mat[i][0])?1:0;
	}
	for(int i=0;i<c;++i)
	{
		s[0][i]=(mat[0][i])?1:0;
	}
	for(int i=1;i<r;++i)
	{
		for(int j=1;j<r;++j)
		{
			if(mat[i][j])
			{s[i][j]=Math.min(s[i][j-1],Math.min(s[i-1][j],s[i-1][j-1]))+1;
			max=Math.max(s[i][j],max);
		}
			else
				s[i][j]=0;
		}
	}
	return max;
}