import java.util.*;
class KMP{
  public static int[] computeLPS(String pat)
  {
    int n=pat.length();
    int lps[]=new int[n];
    lps[0]=0;
    int i=1,len=0;
    while(i<n)
    {
      if(pat.charAt(i)==pat.charAt(len))
      {
        lps[i++]=++len;
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
          //it is same as pattern matching
          //if there is mismatch then skip check for characters those are going to match
          len=lps[len-1];
        }
      }
    }
    return lps;
  }
  public static void KMPpatternMatch(String str,String pat)
  {
    int lps[]=computeLPS(pat);
    int n=str.length();
    int m=pat.length();
    int i=0,j=0;
    while(i<n)
    {
      if(str.charAt(i)==pat.charAt(j))
      {
        ++i;
        ++j;
      }
      if(j==m)
      {System.out.println("Match at pos"+(i-j));
        j=lps[j-1];
      }
      else if(str.charAt(i)!=pat.charAt(j))
      {
        if(j==0)
        ++i;
        else
        {
          j=lps[j-1];
        }
      }
    }
  }
public static void main (String[] args)
 {
Scanner ab=new Scanner(System.in);
int t=ab.nextInt();
while(t-->0)
{
  KMPpatternMatch(ab.next(),ab.next());
    System.out.println();
}
 }
}
