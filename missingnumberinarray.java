public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int xor=0;
		//first array
	    for(int i=0;i<n;i++)
	    xor^=ab.nextInt();
		//second array with 1 element missing
	    for(int i=0;i<n-1;i++)
	    xor^=ab.nextInt();
	    System.out.println(xor);
	}
	 }