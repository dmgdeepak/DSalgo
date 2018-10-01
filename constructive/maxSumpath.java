Problem:
Given two arrays(sorted), the task is to complete the function max_path_sum that takes 4 argument
The first two arguments represent the 2 arrays A[], B[] and the last two arguments l1, l2 denote the size of array A and B respectively.
The function returns the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays
https://practice.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1

Idea is to use merge sort algorithm and maintain two sum for 1st and 2nd array.
When common element is found then we will add max sum from both the arrays to result.
   int maxPathSum(int ar1[], int ar2[])
   {
       int i,j,sum,isum,jsum;
       i=j=sum=isum=jsum=0;
       while(i<ar1.length && j<ar2.length)
       {
         if(ar1[i]==ar2[j])
         {
           sum+=Math.max(isum,jsum)+ar1[i];
           isum=jsum=0;
           ++i;++j;
         }
         else if(ar1[i]<ar2[j])
         {
           isum+=ar1[i++];
         }
         else
         jsum+=ar2[j++];
       }
       while(i<ar1.length)
       {
         isum+=ar1[i++];
       }
       while(j<ar2.length)
       {
         jsum+=ar2[j++];
       }
       return sum+Math.max(isum,jsum);
   }
