/*The Node class is as follows
class Node{
	
	int height;
        int data;
        Node left,right;

	Node(int data)
        {
		this.data = data;
		this.height = 0;
		this.left = null;
		this.right = null;
	}
}*/

class GfG{
     public Node leftrotate(Node node)
     {
         Node newnode=node.right;
         Node b=newnode.left;
        newnode.left=node;
         node.right=b;
         newnode.height=Math.max(height(node.left),height(node.right))+1;
         node.height=Math.max(height(node.left),height(node.right))+1;
         return newnode;
     }
     public Node rightrotate(Node node)
     {
         Node newnode=node.left;
         Node b=newnode.right;
        newnode.right=node;
         node.left=b;
         newnode.height=Math.max(height(node.left),height(node.right))+1;
         node.height=Math.max(height(node.left),height(node.right))+1;
         return newnode;
     }
   public  int balance(Node node)
    {
    return height(node.left)-height(node.right);
}
public  int height(Node node)
    {
    if(node==null)
        return 0;
    else
        return node.height;
}
    public Node insertToAVL(Node node,int data)
    {
        if(node==null)
        {
            return new Node(data);
        }
        if(data>node.data)
       node.right=  insertToAVL(node.right,data);
        else if(data<node.data)
       node.left= insertToAVL(node.left,data);
        else
        return node;
        node.height=Math.max(height(node.left),height(node.right))+1;
        int bal=balance(node);
        if(bal>1)
        {
            if(height(node.left)>height(node.right))
            return rightrotate(node);
           else
           {
               node.left=leftrotate(node.left);
             return  rightrotate(node);
           }
        }
        if(bal<-1)
        {
            if(height(node.left)<height(node.right))
            {
                return leftrotate(node);
            }
            else
            {
                node.right=rightrotate(node.right);
                return leftrotate(node);
            }
        }
        return node;
    }
}