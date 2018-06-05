import java.util.*;
class linkedlistadd
{
	public static linkedlistaddutil(LinkedList<Integer> a,LinkedList<Integer> b,LinkedList<Integer> c)
	{
		LinkedList<Integer> fnl=new LinkedList<Integer>();
		while(!a.isEmpty() && !b.isEmpty() && !c.isEmpty())
		{
			int ad=0;
			int carry=0;
			ad+=a.removeLast();
			ad+=b.removeLast();
			ad+=c.removeLast();
			ad+=carry;
			if(ad/10>0)
			{
				carry=ad/10;
				fnl.add(ad%10)'
			}
			ad=0;
		}
		LinkedList<Integer> s1;
		LinkedList<Integer> s2;
		if(a.size()>0)
		s1=new LinkedList<Integer>();
		else if(b.size()>0)
			
		LinkedList<Integer> s2=new LinkedList<Integer>();
		while(!a.isEmpty() && !c.isEmpty())
		{
			int add=0;
			int carry=0;
			add+=a.removeLast();
			add+=c.removeLast();
			add+=carry;
			if(add/10>0)
			{
				carry=add/10;
				fnl.add(ad%10)'
			}
		}
		while(!a.isEmpty() && !b.isEmpty())
		{
			int add=0;
			int carry=0;
			add+=a.removeLast();
			add+=b.removeLast();
			add+=c.removeLast();
			add+=carry;
			if(add/10>0)
			{
				carry=add/10;
				fnl.add(ad%10)'
			}
		}
	}
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		LinkedList<Integer> lst1=new LinkedList<Integer>();
		LinkedList<Integer> lst2=new LinkedList<Integer>();
		LinkedList<Integer> lst3=new LinkedList<Integer>();
		int n=ab.nextInt();
		int k=ab.nextInt();
		int j=ab.nextInt();
		while(n-->0)
			lst1.add(ab.nextInt());
		while(k-->0)
			lst1.add(ab.nextInt());
		while(j-->0)
			lst1.add(ab.nextInt());
		linkedlistaddutil(lst1,lst2,lst3);
	}
}