/*3
RY
RWR
RRYY */
import java.util.*;
import java.lang.*;
import java.io.*;
class r ry ryy
 {
public static boolean possible(char str[])
{
	if(str[0]!='R')
		return false;
	for(int i=0;i<str.length;++i)
	{
		if(str[i]!='R' || str[i]!='Y')
			return false;
	}
	return true;
}
public static int findY(char str[],int i,int n)
{
		for(int j=i;j<n;++j)
		{
			if(str[i]=='Y')
				return i;
		}
		return -1;
}

public static boolean psearch(String str)
{
	if(!possible(str.toCharArray()))
		return false;
	int i=0,n=str.length;
	while(++i<n)
	{
		i=findY(str.toCharArray(),i,n);
		if(i==-1)
			return true;
		if(str.charAt(i-1)!='R')
			return false;
		if(i+1<n && str.charAt(i+1)=='Y')
			++i;
	}
	return true;
}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(psearch(ab.next()));
	}
	 }
}