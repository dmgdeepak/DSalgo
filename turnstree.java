import java.util.*;  
class turnstree
{
	count=0;
	Node LCA(Node root,Node a,Node b)
	{
		if(root==null)
			return null;
		if(root.data==a.data || root.data==b.data)
			return root;
		Node left=LCA(root.left,a,b);
		Node right=LCA(root.right,a,b);
		if(left!=null && right!=null)
			return root;
		return(left==null)?right:left;
	}
	boolean countturn(Node root,Node a,boolean flag)
	{
		if(root==null)
			return false;
		if(root.data==a.data)
			return true;
		if(flag)
		{
		if(countturn(root.left,a,flag))
			return true;
		if(countturn(root.right,a,!flag))
		{
			count++;
			return true;
	}}
	else
	{
		if(countturn(root.right,a,flag))
			return true;
		if(countturn(root.left,a,!flag))
		{
			count++;
			return true;
		}
	}
	return false;
	}
	int maxturns(Node root,Node left,Node right)
	{
		Node lca=LCA(root,left,right);
		if(lca.data!=left.data &&  lca.data!=right.data)
		{
			if(countturn(lca.left,left,true) || countturn(lca.right,left,false));
			if(countturn(lca.left,right,true) || countturn(lca.right,right,false));
			return count+1; // for root
		}
		if(lca.data==left.data )
		{
			if(countturn(lca.left,right,true) || countturn(lca.right,right,false));
			return count;
		}
		if(lca.data==right.data )
		{
			if(countturn(lca.left,left,true) || countturn(lca.right,left,false));
			return count;
		}
	}
}