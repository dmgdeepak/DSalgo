 http://hackerranksolutionc.blogspot.com/2017/10/maxmum-circular-subarray-sum.html
 public static int kadane(int arr[],int n)
     {
         int max=0,cur=0;
         for(int i=0;i<n;++i)
         {
             cur+=arr[i];
             if(max<cur)
             max=cur;
             if(cur<0)
             cur=0;
         }
         return max;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	loop:
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    boolean isNeg=true;
	    int neg=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=ab.nextInt();
	        if(arr[i]>0)
	        isNeg=false;
	        else
	        neg=Math.max(neg,arr[i]);
	    }
	    if(isNeg)
	    {
	        System.out.println(neg);
	        continue loop;
	    }
	    int x=kadane(arr,n);
	    int arrsum=arr[0];
	    arr[0]=-arr[0];
	    for(int i=1;i<n;++i)
	    {
	        arrsum+=arr[i];
	        arr[i]=-arr[i];
	    }
	    arrsum+=kadane(arr,n);
	    System.out.println((x>arrsum)?x:arrsum);
	}
	 }