public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=n;
	    int pos=-1;
	    int count=0;
	    while(n>0)
	    {
	        ++count;
	        n=n>>1;
	    }
	    int num=1;
	    num=num<<pos-1;
	    if(num<k)
	    num=num<<1;
	    System.out.println(num);
	}
	
}