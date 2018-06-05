public static int MaxSumBiotonic(int arr[],int n)
	 {
		 int ls[]=new int[n];
		 int rs[]=new int[n];
		 int temp=arr[0];
		 for(int i=0;i<n;++i)
		 {
			 ls[i]=rs[i]=arr[i];
		 }
		 for(int i=1;i<n;++i)
		 {
			for(int j=0;j<i;++j)
			{
				if(ls[i]<ls[j]+arr[i] && arr[i]>arr[j])
					ls[i]=ls[j]+arr[i];
			}
		 }
		 for(int i=n-2;i>=0;--i)
		 {
			for(int j=n-1;j>i;--j)
			{
				if(arr[i]>arr[j] && rs[i]<rs[j]+arr[i])
					rs[i]=rs[j]+arr[i];
			}
		 }
		 for(int i=0;i<n;++i)
		 {
			 temp=Math.max(temp,ls[i]+rs[i]-arr[i]);
		 }
		 return temp;
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
	    System.out.println(MaxSumBiotonic(arr,n));
	}
	 }