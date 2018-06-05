 public static boolean consecutivesum(long n)
     {
         return ((n&(n-1))!=0 && n!=0);
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    long n=ab.nextLong();
	    System.out.println(consecutivesum(n)?"1":"0");
	}
	 }