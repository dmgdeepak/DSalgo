int search(int arr[],int low,int high)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==1)
            {
                if(mid==0 || arr[mid-1]==0)
                return mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return -1;
    }