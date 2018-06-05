Idea is to use temporary space to save occurence of even and odd sum subsequence.
Put formula n*(n-1)/2 {No. of possible sequence }
	public static int SubArrayWithEvenSum(int arr[],int n)
	{
		//Array to save no. of subsequence with even and odd sum
	int temp[]=new int[2];	
	temp[0]=1;
	int sum=0;
	for(int i=0;i<n;++i)
	{
		sum+=arr[i];
		temp[(sum+2)%2]++;
	}
	sum=temp[0]*(temp[0]-1)/2;
	sum+=temp[1]*(temp[1]-1)/2;
	return sum;
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
	    System.out.println(SubArrayWithEvenSum(arr,n));
	}
	 }
