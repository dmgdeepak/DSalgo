find a pair which satisfy a+b=c+d


Idea is to go through every pair and save sum into a hashMap and search if sum is there or not.


Code:

 public static boolean isEqual(int arr[],int n)
     {
         if(n<4)
         return false;
         List<Integer> hash=new ArrayList<Integer>();
         for(int i=0;i<n;i++)
         for(int j=i+1;j<n;++j)
         {
             int sum=arr[i]+arr[j];
             if(hash.contains(sum))
             return true;
             hash.add(sum);
         }
         return false;
     }