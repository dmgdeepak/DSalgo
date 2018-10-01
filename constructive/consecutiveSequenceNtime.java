int findLongestConseqSubseq(int a[], int n)
    {
	     HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       int maxLen=0,startelement=-1;
       for(int i:a)
       {
         if(map.containsKey(i)) continue;
         int start=i,end=i;
         if(map.containsKey(i-1) && map.get(i-1)<i)
         {
           start=map.get(i-1);
           map.remove(start);
           map.remove(i-1);
         }
         if(map.containsKey(i+1) && map.get(i+1)>i)
         {
           end=map.get(i+1);
           map.remove(end);
           map.remove(i+1);
         }
         map.put(start,end);
         map.put(end,start);
         if(end-start+1>maxLen)
         {
           maxLen=end-start+1;
           startelement=start;
         }
       }
       return maxLen;
    }
