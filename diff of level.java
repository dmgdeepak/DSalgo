/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// A Binary Tree node
/* class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}  */
class GfG
{   /*You are required to complete this function*/
    int getLevelDiff(Node root)
    {
        int res=0;
        int res1=0;
        int ans=0;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            if(temp==null)
            {
                flag=!flag;
                if(!q.isEmpty())
                q.add(null);
                continue;
            }
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
            if(flag)
            {
                res+=temp.data;
            }
            else
            res1+=temp.data;
        }
    }
}