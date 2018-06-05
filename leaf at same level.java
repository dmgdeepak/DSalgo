 int l=-1;
    boolean p(Node root,int lvl)
    {
        if(root==null)
        return true;
        if(root.left==null && root.right==null)
        {
            if(l==-1)
            {l=lvl;
                return true;
            }
            else if(l==lvl)
            return true;
            return false;
        }
        return p(root.left,lvl+1) && p(root.right,lvl+1);
        
    }
    boolean check(Node root)
    {
	// Your code here	
	if(root==null)
	return true;
	return p(root,0);
    }