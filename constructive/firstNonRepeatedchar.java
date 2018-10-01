import java.util.*;
import java.lang.*;
import java.io.*;
class firstRepeatedchar
 {
   public static String firstRepeated(String str)
   {
     Set<Character> set =new HashSet<Character>();
     int min=-1;
     for(int i=str.length()-1;i>=0;--i)
     {
       if(set.contains(str.charAt(i)))
       min=i;
       else
       set.add(str.charAt(i));
     }
     return (min!=-1)?String.valueOf(str.charAt(min)):"-1";
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(firstNonRepeated(ab.next()));
	}
	 }
}
