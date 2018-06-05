import java.util.*;
import java.lang.*;
import java.io.*;
class stringrotationofeachother
 {
 	public static boolean isRotation(String a,String b)
 	{
    int n=a.length();
    int m=b.length();
    if(n!=m)
    return false;
    int lps[]=new int[n];
    int i=1,len=0;
    lps[0]=0;
    while(i<n)
    {
      if(a.charAt(i)==b.charAt(len))
      {
        lps[i]=++len;
        ++i;
      }
      else
      {
        if(len==0)
        {
          lps[i]=0;
          ++i;
        }
        else
        {
          len=lps[len-1];
        }
      }
    }
  //  System.out.println(lps[n-1]);
  i=0;
    for(int k=lps[n-1];k<m;++k)
    {
      if(b.charAt(k)!=a.charAt(i++))
      return false;
    }
    return true;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(isRotation(ab.next(),ab.next())?"1":"0");
	}
	 }
}
