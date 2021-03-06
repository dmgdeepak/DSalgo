 Node constructTreeUtil(int pre[], char preLN[], Index index_ptr, 
                                                     int n, Node temp)
    {
        // store the current value of index in pre[]
        int index = index_ptr.index; 
  
        // Base Case: All nodes are constructed
        if (index == n)
            return null;
  
        // Allocate memory for this node and increment index for
        // subsequent recursive calls
        temp = new Node(pre[index]);
        (index_ptr.index)++;
  
        // If this is an internal node, construct left and right subtrees 
        // and link the subtrees
        if (preLN[index] == 'N') 
        {
            temp.left = constructTreeUtil(pre, preLN, index_ptr, n, 
                                                               temp.left);
            temp.right = constructTreeUtil(pre, preLN, index_ptr, n, 
                                                               temp.right);
        }
  
        return temp;
    }