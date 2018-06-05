import java.util.*;
import java.lang.*;
import java.io.*;
class longestKuniqechar
 {
   public static int longestKuniqe(String str,int k)
   {
     int res=0;
     HashMap<Character,Integer> map=new HashMap<>();
     int start=0;
     int len=0;
     int n=str.length();
     for(int i=0;i<n;++i)
     {
       char c=str.charAt(i);
       if(map.containsKey(c))
       map.put(c,map.get(c)+1);
       else
       map.put(c,1);
       if(map.size()==k)
       {
         len=Math.max(len,i-start+1);
       }
       while(map.size()>k)
       {
         char rem=str.charAt(start);
         if(map.containsKey(rem))
         {
           if(map.get(rem)>1)
           map.put(rem,map.get(rem)-1);
           else
           map.remove(rem);
         }
         ++start;
       }
     }
     return len;
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(longestKuniqe(ab.next(),ab.nextInt()));
	}
	 }
}
