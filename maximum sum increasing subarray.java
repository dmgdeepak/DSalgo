Idea is to use dp

Base case = initial value of array

Check for every pair and if arr[i]>arr[j]
then check for previous processed dp[j] and check for new maximum value;


Code:

public static void main (String[] args)
  {
 Scanner ab=new Scanner(System.in);
 int t=ab.nextInt();
 while(t-->0)
 {
     int n=ab.nextInt();
     int arr[]=new int[n];
     int dp[]=new int[n];
     for(int i=0;i<n;++i)
    { arr[i]=ab.nextInt();
     dp[i]=arr[i];
        } 
        int max=dp[0];
     for(int i=1;i<n;++i)
     for(int j=0;j<i;++j)
     {
         if(arr[i]>arr[j] && dp[i]<dp[j]+arr[i])
         {
             dp[i]=dp[j]+arr[i];
             
         }
         max=Math.max(max,dp[i]);
     }
     System.out.println(max);
 }
  }