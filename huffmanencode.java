import java.util.*;  
class huffmanTree
{
	int freq;
	char data;
	huffmanTree left;
	huffmanTree right;
	public huffmanTree(int x,char y)
	{
		freq=x;
		data=y;
		right=null;
		left=null;
	}
	public huffmanTree(int x,char y,huffmanTree u,huffmanTree o)
	{
		freq=x;
		data=y;
		right=o;
		left=u;
	}
	public int getfreq()
	{
		return this.freq;
	}
	public char getdata()
	{
		return this.data;
	}
	//public void 
}
class huffmanencode
{
	public static void maketree(PriorityQueue<huffmanTree> pq)
	{
		while(pq.size()>1)
		{
			huffmanTree t1=pq.poll();
			huffmanTree t2=pq.poll();
			int data=t1.getfreq()+t2.getfreq();
			pq.add(new huffmanTree(data,'$',t1,t2));
		}
		print(pq.poll(),"");
	}
	public static void print(huffmanTree h,String str)
	{
		if(h==null)
			return;
		if(h.getdata()!='$')
			System.out.println(h.getdata()+" "+str);
		print(h.left,str+"0");
		print(h.right,str+"1");
	}
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
		String str=new String(ab.next());
		//int fr[]=new int[str.length()];
		Comparator<huffmanTree> comp=new Comparator<huffmanTree>()
		{
			@Override
			public int compare(huffmanTree a,huffmanTree b)
			{
				return Integer.compare(a.getfreq(),b.getfreq());
			}
		};
		PriorityQueue<huffmanTree> pq=new PriorityQueue<huffmanTree>(comp);
		
		for(int i=0;i<str.length();i++)
			pq.add(new huffmanTree(ab.nextInt(),str.charAt(i))); 
		Iterator<huffmanTree> itr=pq.iterator();
		while(itr.hasNext())
		{
			huffmanTree pope=itr.next();
			System.out.println(pope.getfreq()+" " +pope.getdata());}
	maketree(pq);
	}
	}
}