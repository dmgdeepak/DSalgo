import java.util.*;
import java.util.regex.*;  
import java.lang.*;
import java.io.*;
class resample
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	   String str=ab.nextLine();
	   int count=0;
	   Pattern p=Pattern.compile("[aiouy]");
	   Matcher m=p.matcher(str);
	   while(m.find())
	   count++;
	   System.out.println(count);
	}
	 }
}