	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=n^ab.nextInt();
	 //   int setbits=0;
	    int c=0;
	    while(k>0)
	    {
	        if((k&1)==1)
	        ++c;
	        k>>=1;
	    }
	    System.out.println(c);
	}
	 }