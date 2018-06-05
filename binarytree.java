import java.util.*;
class bst
{
	int data;
	bst left,right;
	public bst(int x)
	{
		this.data=x;
	left=right=null;
	}
}
class binarytree
{
	public bst root=null;
	public void add(bst temp,bst node)
	{
		if(temp.data<node.data)
		{
			if(temp.right==null)
				temp.right=node;
			else
				add(temp.right,node)
		}
			else if(temp.data>node.data)
			{
				if(temp.left==null)
					temp.left=node;
				else
					add(temp.left,node);
			}
	}
	public static void main(String args[])
	{
		
	}
}