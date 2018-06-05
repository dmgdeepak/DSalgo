http://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion/0

Idea is to check sign as asked in question and if any contradict found then just swap elements

	 public static void zigZagArray(int arr[],int n)
	 {
		 boolean flag=true;
		 for(int i=0;i<n-1;++i)
		 {
			 if(flag)
			 {
				 if(arr[i]>arr[i+1])
				 {
					 int temp=arr[i];
		 arr[i]=arr[i+1];
		 arr[i+1]=temp;
				 }
			 }
			 else
			 {
				  if(arr[i]<arr[i+1])
				 {
					 int temp=arr[i];
		 arr[i]=arr[i+1];
		 arr[i+1]=temp;
				 }
			 }
			 flag=!flag;
			 
			 }
			 for(int x:arr)
			 {
			     System.out.print(x+" ");
			 }
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
	zigZagArray(arr,n);
	    System.out.println();
	}
	 }
