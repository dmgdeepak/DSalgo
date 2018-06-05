int KthsmallestBst(Node root,int k)
{
	int min=-1;
	while(root!=null)
	{
		if(k==root.lcount+1)
	return root.data;
	if(k<root.lcount)
	{
		root=root.left;
	}
	if(k>root.lcount)
	{
		root=root.right;
		k=k-root.lcount-1;
	}
	}
	return min;
}