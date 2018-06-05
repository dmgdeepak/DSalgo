import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void divisible(char str[],int a,int b)
     {
         int len=str.length;
        // System.out.println(String.valueOf(str)+" "+a+" "+b);
         //left and right remainder
         int lr[]=new int[len+1];
         int rr[]=new int[len+1];
         lr[0]=(str[0]-'0')%a;
         for(int i=1;i<len;++i)
         {
             lr[i]=((lr[i-1]*10)%a+(str[i]-'0'))%a;
            
         }
         rr[len-1]=(str[len-1]-'0')%b;
         int p=10;
         for(int i=len-2;i>=0;--i)
         {
             rr[i]=(rr[i+1]+(str[i]-'0')*p)%b;
             p=(p*10)%b;
         }
         int i;
         for(i=0;i<len-1;++i)
         {
             if(lr[i]==0 && rr[i+1]==0)
             {
                 System.out.print(Arrays.copyOfRange(str,0,i+1));
                 System.out.print(" ");
                 System.out.print(Arrays.copyOfRange(str,i+1,len));
                 break;
             }
         }
         if(i==len-1)
         System.out.print("-1");
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    String str=ab.next();
	    divisible(str.toCharArray(),ab.nextInt(),ab.nextInt());
	    System.out.println();
	}
	 }
}