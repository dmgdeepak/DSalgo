/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    void levelOrder(Node node) 
    {
        if(node==null)
        return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty())
        {
            Node t=q.removeFirst();
            if(t!=null)
            {
                System.out.print(t.data+" ");
             if(t.left!=null)
            q.add(t.left);
            if(t.right!=null)
            q.add(t.right);
                
            }
            else
           {System.out.print("$ ");
           if(!q.isEmpty())
            q.add(null);}
        }
    }
}