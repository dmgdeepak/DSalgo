int ans=Integer.MIN_VALUE;
    int maxU(Node root)
    {
        if(root==null)
		return Integer.MAX_VALUE;
		if(root.left==null && root.right==null)
		return root.data;
		int val=Math.min(maxU(root.left),maxU(root.right));
		ans=Math.max(ans,root.data-val);
		return Math.min(val,root.data);
    }
    
	int maxDiff(Node root)
	{
		maxU(root);
		return ans;
	}