C(n,r)=C(n-1,r-1)+C(n-1,r)
C(n,0)=c(n,n)=1


We can implement DP with O(n*k) space with base case 1 for i=0 or i=n
and follow up 

Code :

int C[][] = new int[n+1][k+1];
    int i, j;
     
    for (i = 0; i <= n; i++)
    {
        for (j = 0; j <= min(i, k); j++)
        {
            // Base Cases
            if (j == 0 || j == i)
                C[i][j] = 1;
      
            // Calculate value using previosly stored values
            else
                C[i][j] = C[i-1][j-1] + C[i-1][j];
          }
     }
      
    return C[n][k];

Rather we can do it By O(K) space 


Code:

public static int binomialCoff(int n,int r)
    {
        int arr[]=new int[r+1];
        arr[0]=1;
        for(int i=1;i<=n;++i)
        {
         //Min is performed so that it won't go more than r (array range)
            for(int j=Math.min(i,r);j>0;--j)
            {
//add previous values
                arr[j]=(arr[j]+arr[j-1])%1000000007;
            }
        }
        return arr[r];
    }