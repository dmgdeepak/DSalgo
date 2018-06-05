 int val=0;
    void modify(Node root)
    {
	if(root==null)
	return;
	modify(root.right);
	root.data+=val;
	val=root.data;
	modify(root.left);
    }