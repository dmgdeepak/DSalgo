import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;
class replacePatternX
 {
  public static String replacePattern(String str,String pat)
  {
    Pattern p=Pattern.compile("("+pat+")+");
    Matcher m=p.matcher(str);
    return m.replaceAll(String.valueOf('X'));
  }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(replacePattern(ab.next(),ab.next()));
	}
	 }
}
