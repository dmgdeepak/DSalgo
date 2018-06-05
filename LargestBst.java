Class Info
{
public int size;
public int max;
public int min;
public int ans;
public boolean isBst;	
Info(int s,int max,int min,int a,boolean flag)
{
	size=s;
	this.max=max;
	this.min=min;
	ans=a;
	isBst=flag;
}
}
Info LargestBst(Node root)
{
	if(root==null)
	{
		return new Info(0,Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
	}
	if(root.left==null && root.right==null)
	{
		return new Info(1,Integer.MIN_VALUE,Integer.MAX_VALUE,1,true);
	}
	Info l=LargestBst(root.left);
	Info r=LargestBst(root.right);
	Info temp=new Info();
	temp.size=l.size+r.size+1;
	if(l.isBst && r.isBst && l.max<root.data && r.min>root.data)
	{
		temp.min=Math.min(l.min,Math.min(r.min,root.data));
		temp.max=Math.max(l.max,Math.max(r.max,root.data));
		temp.isBst=true;
		return temp;
	}
	// if not BST
	temp.isBst=false;
	temp.ans=Math.max(l.size,r.size);
	return temp;
}