 public void diagonalPrint(TreeNode root)
      {
          Queue<TreeNode> q=new LinkedList<TreeNode>();
           do
           {
               while(root!=null)
               {
                q.add(root)   ;
                root=root.right;
               }
               TreeNode t=q.remove();
               System.out.print(t.data+" ");
               root=t.left;
           }while(!q.isEmpty());
      }