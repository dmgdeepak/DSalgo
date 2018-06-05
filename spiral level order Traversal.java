/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class GfG
{
      void printSpiral(Node node) 
      {
           Stack<Node> s1=new Stack<Node>();
           Stack<Node> s2=new Stack<Node>();
           s1.push(root);
           while(!s1.empty() || !s2.empty())
           {
               if(!s1.empty())
               {
                   Node temp=s1.peek();
                   s1.pop();
                   System.out.print(temp.data+" ");
                   while(temp.right!=null)
                   s2.push(temp.right);
                   while(temp.left!=null)
                   s2.push(temp.left);
               }
               if(!s2.empty())
               {
                    Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.data + " ");
 
                // Note that is left is pushed before right
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
               }
           }
      }
}
