import java.util.*;
import java.lang.*;

class tidy
{
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		int t=ab.nextInt();
		while(t-->0)
		{
			StringBuffer str=new StringBuffer(ab.nextLine());
			str.append( ab.nextLine());
		//str=ab.next();
		int len=str.length();
		System.out.println(check(str,len));
		}
	}
	public static StringBuffer check(StringBuffer str,int len)
	{
		if(len-->0)
		{
			if(str.charAt(len-2)>str.charAt(len-1))
			{
			str.setCharAt(len-1,'9');	
			str.setCharAt(len-2,(char)(str.charAt(len-2)-1));	
			check(str,len--);
			}
		}
		else
			return str;
	}
}