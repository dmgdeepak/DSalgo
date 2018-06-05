  If right subtree of node is not NULL, then succ lies in right subtree. Do following.
Go to right subtree and return the node with minimum key value in right subtree.
2) If right sbtree of node is NULL, then start from root and us search like technique. Do following.
Travel down the tree, if a node’s data is greater than root’s data then go right side, otherwise go to left side.
 
 public Node min(Node x)
    {
        while(x.left!=null)
        {
            x=x.left;
        }
        
        return x;
    }
	public Node inorderSuccessor(Node root,Node k)
         {
             Node suc=null;
          if(k.right!=null)
          return min(k.right);
              while(root!=null)
              {
                  if(k.data<root.data)
                  {
                      suc=root;
                      root=root.left;
                  }
                  else if(k.data>root.data)
                  {
                      root=root.right;
                  }
                  else
                  break;
              }
          return suc;
         }
}