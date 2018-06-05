Idea is to use maxHeap 
Pop ith position element.
peek for biggest element

Code:
	public static void greatestOnRight(int arr[],int n)
	{
		PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int x:arr)
			q.offer(x);
		int i=0;
		while(i<n-1 && !q.isEmpty())
		{
			q.remove(arr[i++]);
			System.out.print(q.peek()+" ");
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
	    greatestOnRight(arr,n);
	    System.out.println("-1");
	}
	 }
