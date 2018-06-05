/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete The given function
The Node class is as follows:
class Node{
    int data;
    Node left,right;
    
    Node(int d)
     {
      data=d;
      left=null;
      right=null;
    }
}*/
class GfG{
    public  void printExtremeNode(Node node)
      {
          if(node==null)
          return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        boolean flag=false;
        while(!q.isEmpty())
        {
            int n=q.size();
            int size=n;
            while(--n>0)
            {
                Node t=q.remove();
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
                if(n==size-1 && flag)
                {
                    System.out.print(node.data+" ");
                    
                }
                if(n==0 && !flag)
                {
                    System.out.print(node.data+" ");
                    //break;
                }
            }
			
                flag=!flag;
        }
      }
}