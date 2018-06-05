public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
	    int ans;
	    if(k<=0)
	    ans=n;
	    else
	    {
	        int cur=n;
	        int c=0;
	        while(cur>0)
	        {
	            ++c;
	            cur=cur>>1;
	        }
	        ans=n&(~(1<<(c-k)));
	    }
	    System.out.println(ans);
	}