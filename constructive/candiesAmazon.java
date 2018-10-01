import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/candies/
public class candiesAmazon {

    static int candies(int n, int[] arr) {
        int dp[]=new int[n];
		Arrays.fill(dp,1);// as child will get min 1 candy
		// check if rank of current is greater than previous then it will have 1 more candie than previous
		for(int i=1;i<n;++i)
		{
			if(arr[i]>arr[i-1])
				dp[i]=dp[i-1]+1;
		}
		for(int x:dp)
		System.out.print(x+" ");
	System.out.println();
	//loop from back and check if next child is having less rank and the student had same or less candie then current will get 1 more candie
		for(int i=n-2;i>=0;--i)
		{
			if(arr[i]>arr[i+1] && dp[i]<=dp[i+1])
				dp[i]=dp[i+1]+1;
		}
		int res=0;
		for(int x:dp)
		res+=x;
		return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = candies(n, arr);
        System.out.println(result);
        in.close();
    }
}
