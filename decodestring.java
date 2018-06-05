import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
		String str=new String(ab.nextLine());
		String str2=new String(;)
		ab.next();
		int len=str.length();
		boolean f1,f2;
		f1=f2=false;
		int count;
		int i=0;
		if(str[0]>'0' && str[0]<='9')
		{
			i=1;
			startno=str[0]-48;
		}
		for(;i<len;i++)
		{
			if(str[i]=='[')
			{
				count=i;
				String newstr=new String();
			}
			if(str[i+1]]>'0' && str[i+1]<='9')
			{
				num=str[i+1]-48;
			}
			if(str[i]>='a' && str[i]<='z')
			{
				newstr.concat(str[i])
			}
			if(str[i]==']')
			{
				while(num-->0)
				newstr.concat(newstr);
			str2=newstr;
			str.replace()
			count=0;;
			}
		}
		
		while(startno-->0)
			str2.concat(str2);
		System.out.println(str2);
	}
	 }
}