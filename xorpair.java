Given an array of distinct +ve integers A[] and a number x, 
your task is to find the number of pairs of integers in the array whose XOR is equal to x.


public static int xorpair(int arr[],int n,int x)
     {
         Set<Integer> h=new HashSet<Integer>();
         int c=0;
         for(int t:arr)
         {
             if(h.contains(t^x))
             ++c;
             h.add(t);
         }
         return c;
     }