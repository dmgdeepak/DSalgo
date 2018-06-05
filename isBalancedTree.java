 boolean isBalanced(Node root,height o)
    {
	if(root==null)
	{
	    o.h=0;
	    return true;
	}
	height x=new height(),y=new height();
	boolean l=isBalanced(root.left,x);
	boolean r=isBalanced(root.right,y);
	o.h=((x.h>y.h)?x.h:y.h)+1;
	if(Math.abs(x.h-y.h)>1)
	return false;
	return l&r;
    }
    boolean isBalanced(Node root)
    {
        Integer t;
	return isBalanced(root,new height());
    }