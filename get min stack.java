	public int min(Stack<Integer> s)
        {
           int m=Integer.MAX_VALUE;
           for(int t:s)
           {
               if(t<m)
               m=t;
           }
           return m;
	}