Idea is to use map (sum - index)
if we see the sum again it means that from that index(saved in map )to current we have an array 
whose sum is 0 that's why sum is seen again.

Note : we should keep first index mapped with sum as it leads to max subarray


    int maxLen(int arr[], int n)
    {
        // Your code here
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int len=0;
        int sum=0;
        for(int i=0;i<n;++i)
        {
            sum+=arr[i];
            if(arr[i]==0 && len==0)
            len=1;
            if(sum==0)
            len=i+1;
           if(map.containsKey(sum))
            {
                len=Math.max(len,i-map.get(sum));
            }
            else
            map.put(sum,i);
        }
        return len;
    }
