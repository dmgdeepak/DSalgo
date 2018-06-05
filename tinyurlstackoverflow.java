import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
      private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int    BASE     = ALPHABET.length();
        public static String encode(long num) {
        StringBuilder sb = new StringBuilder();
        while ( num > 0 ) {
            sb.append( ALPHABET.charAt((int) num % BASE ) );
            num /= BASE;
        }
        return sb.reverse().toString();   
    }

	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    long n=ab.nextLong();
	    System.out.println(encode(n)+"\n"+n);
	}
	 }
}