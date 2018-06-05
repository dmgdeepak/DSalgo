	void swap(Node node,boolean flag)
	{
	    if(node==null || (node.left==null && node.right==null))
	    return;
	    if(flag){
	    int l=node.left.data;
	    node.left.data=node.right.data;
	    node.right.data=l;}
	    swap(node.left,!flag);
	    swap(node.right,!flag);
	}