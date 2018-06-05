Problem :
Find maximum difference where small element occur before than large one.

	 public static int maximumDifference(int arr[],int n)
	 {
		 int min=arr[0];
		 int diff=-1;
		 for(int i=1;i<n;++i)
		 {
			 min=Math.min(min,arr[i]);
			 if(arr[i]>min)
				 diff=Math.max(diff,arr[i]-min);
		 }
		 return diff;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(maximumDifference(arr,n));
	}
	 }
