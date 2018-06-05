import java.util.*;
import java.lang.*;
import java.io.*;
class max1inOneMove
 {
	 public static int max1inOneMove(String str)
	 {
		 int max=0;
		 int len=str.length();
		 int zero=0,one=0;
		 int zcount[]=new int[len+1];
		 int ocount[]=new int[len+1];
		 for(int i=0;i<len;++i)
		 {
			 if(str.charAt(i)=='1')
			 {
				 ++one;
				 ocount[i+1]=one;
				 zcount[i+1]=zero;
			 }
			 if(str.charAt(i)=='0')
			 {
				 ++zero;
				 ocount[i+1]=one;
				 zcount[i+1]=zero;
			 }
		 }
		 if(one==len)
			 return len-1;
		 if(zero==len)
		 return len;
	 for(int i=1;i<=len;++i)
		 for(int j=i;j<=len;++j)
	 {
		max=Math.max(max,(zcount[j]-zcount[i-1])-(ocount[j]-ocount[i-1]));
	 }
	 return max+ocount[len];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(max1inOneMove(ab.next()));
	}
	 }
}
000000001101000101100000000011010000100110110100100100100101010101101010110111000010110110011000011011101010010110010011011000001001011001101111100101001101110000111011110110110101011001110000100101101101011110001100011000000001011010010010111001111000111100010110100010001010000000010010110010101100110100000111001000000000000001011010100000000110110001010100000100111111110011011011010000010001110100110010110100101111101