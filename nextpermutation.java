import java.util.*;
class nextpermutation
{
	public static void swap(StringBuffer str,int i,int j)
	{
		char l=str.charAt(i);
		char k=str.charAt(j);
		str.setCharAt(i,k);
		str.setCharAt(j,l);
	}
	public static void permute(StringBuffer str,int l,int r)
	{
		if(l==r)
			System.out.println(str);
		else
		{
			for(int i=l;i<=r;i++)
			{
				swap(str,l,i);
				permute(str,l+1,r);
				swap(str,l,i);
			}
		}
	}
public static void main(String args[])
{
	StringBuffer str=new StringBuffer("abc");
	permute(str,0,str.length()-1);
}
}