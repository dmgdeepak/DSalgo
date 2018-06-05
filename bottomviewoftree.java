 public void bottomView(Node root)
    {
        if(root==null)
        return;
        Queue<Node> q=new LinkedList<Node>();
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        root.hd=0;
        q.add(root);
        while(!q.isEmpty())
        {
          //  System.out.print("in  ");
            Node t=q.remove();
            map.put(t.hd,t.data); 
            if(t.left!=null)
           { 
                t.left.hd=t.hd-1;
               q.add(t.left);
               
           }   
            if(t.right!=null)
            {
                
                t.right.hd=t.hd+1;
                q.add(t.right);
            }
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            System.out.print(m.getValue()+" ");
        }
    }