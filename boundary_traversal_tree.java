/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class hackerranksolutionc
{
    void left(Node root)
    {
        if(root==null)
        return;
        if(root.left!=null)
        {
            System.out.print(root.data+" ");
            left(root.left);
        }
        else if(root.right!=null)
        {
            System.out.print(root.data+" ");
            left(root.right);
        }
    }
    void right(Node root)
    {
        if(root==null)
        return;
        if(root.right!=null)
        {
            right(root.right);
            System.out.print(root.data+" ");
        }
        else if(root.left!=null)
        {
            right(root.left);
            System.out.print(root.data+" ");
        }
    }
    void printleaf(Node node)
    {
        if(node==null)
        return;
        if(node.left!=null)
         printleaf(node.left);
        if(node.left==null && node.right==null)
         System.out.print(node.data+" ");
         
         else if(node.right!=null)
         printleaf(node.right);
    }
	void printBoundary(Node node)
	{ System.out.print(node.data+" ");
		left(node.left);
		printleaf(node);
		right(node.right);
	}
}