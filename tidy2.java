import java.util.*;
import java.lang.*;

class tidy2
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
		while(--len>0)
		{
				if(str.charAt(len-1)=='0')
			{
				str.setCharAt(len,'9');	
				boolean check=false;
				int temp=len-1;
				while(--temp>=0)
				{
					if(str.charAt(temp)>'0')
					{
						check=true;
						System.out.println(check);
						break;
					}
				}
				temp=len-1;
				str.setCharAt(len-1,'9');
				if(check)
				{
					while((str.charAt(--temp)=='0') && temp>0)
					{
						str.setCharAt(temp,'9');
					}
					str.setCharAt(temp,(char)(str.charAt(temp)-1));
				}
			}
			if(str.charAt(len-1)>str.charAt(len))
			{
			str.setCharAt(len,'9');	
			str.setCharAt(len-1,(char)(str.charAt(len-1)-1));	
			//check(str,len--);
			}
		}
		System.out.println(str);
		}
	}
}