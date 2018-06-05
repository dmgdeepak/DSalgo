 Problem:
 Given an array A[ ] denoting the time taken to complete N tasks, 
 determine the minimum amount of time required to finish the tasks considering that you can skip any task,
 but skipping two consecutive tasks is forbidden
 
 Idea is to take last element / curr+second last element
 
 http://practice.geeksforgeeks.org/problems/skip-the-work/0
 public static int skip_one(int arr[],int n)
     {
         int incl=arr[0];
         int excl=0;
         int res;
         for(int i=1;i<n;++i)
         {
             res=arr[i]+Math.min(incl,excl);
             excl=incl;
             incl=res;
             
         }
         return Math.min(excl,incl);
     }