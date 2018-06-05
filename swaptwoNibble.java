	“x & 0x0F” gives us last 4 bits of x
	The expression “x & 0xF0” gives us first four bits of x
	http://practice.geeksforgeeks.org/problems/swap-two-nibbles-in-a-byte/0
	
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println((n&0x0F)<<4 | (n&0xF0)>>4);
	}
	 }