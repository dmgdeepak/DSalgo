Node KthsmallestmorrisInorder(Node root,int k)
{
	if(root==null)
		return;
	int count=0;
	Node curr=root;
	while(curr!=null)
	{
		//tree has no left subtree so move to right
	if(curr.left==null)
	{
		++count;
		if(count==k)
			return curr;
		curr=curr.right;
	}
	else
	{
		//find preorder suceesor to link with its root
		Node pre=curr.left;
		while(pre.right!=null || pre.right==curr)
			pre=pre.right;
		//we have already traversed this tree so remove link and move to right subtree
		if(pre.right==curr)
		{
			pre.right=null;
		++count;
		if(count==k)
			return curr;
			curr=curr.right;
		}
		else {
			//link child's right
			pre.right=curr;
			curr=curr.left;
		}
	}
	}
}