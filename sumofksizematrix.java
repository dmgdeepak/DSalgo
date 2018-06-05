class sumofksizematrix
{
  public static void printSumTricky(int mat[][],int k)
  {
    int res[][]=new int[5][5];
    for(int i=0;i<5;++i)
    {
      res[i][0]=mat[i][0];
      for(int j=1;j<k;++j)
      {
        res[i][j]=res[i][j-1]+mat[i][j];
      }
      for(int j=k;j<5;++j)
      {
        res[i][j]=res[i][j-1]+mat[i][j]-mat[i][j-k];
      }
    }

    for(int i=0;i<5;++i)
    {  for(int j=0;j<5;++j)
      {
        System.out.print(res[i][j]+" ");
      }
        System.out.println();
    }
    for(int j=0;j<5;++j)
    {
      for(int i=1;i<k;++i)
      {
        res[i][j]+=res[i-1][j];
      }
      for(int i=k;i<5;++i)
      {
        res[i][j]+=res[i-1][j]-res[i-k][j];
      }
    }
    for(int i=0;i<5;++i)
    {  for(int j=0;j<5;++j)
      {
        System.out.print(res[i][j]+" ");
      }
        System.out.println();
    }
  }
public static void main(String[] args)
{
    int mat[][] = {{1, 1, 4, 1, 1},
					{2, 2, 2, 2, 2},
					{3, 3, 9, 3, 3},
					{4, 24, 4, 4, 4},
					{5, 5, 35, 5, 75},
					};
    int k = 3;
    printSumTricky(mat, k);
}
}
