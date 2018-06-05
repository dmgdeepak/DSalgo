void swapValue(Node left,Node right)
	{
	     int l=left.data;
	   left.data=right.data;
	    right.data=l;
	}
	void reverse(Node l,Node r,boolean flag)
	{
	    if(l==null || r==null)
	    return;
	    if(flag)
	    swapValue(l,r);
	    reverse(l.left,r.right,!flag);
	    reverse(l.right,r.left,!flag);
	}
        void reverseAlternate(Node node)
        {
                reverse(node.left,node.right,true);
        }