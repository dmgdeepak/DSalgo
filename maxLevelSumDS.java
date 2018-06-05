	public static int maxLevelSum(Node root)
         {
         if(root==null)
			 return 0;
		 Queue<Node> q=new LinkedList<Node>();
		 q.add(root);
		 q.add(null);
		 int ans=root.data;
		 int temp=0;
		 while(!q.isEmpty())
		 {
			 Node t=q.poll();
			 if(t!=null)
			 {
				 temp+=t.data;
				 if(t.left!=null)
					 q.add(t.left);
				  if(t.right!=null)
				 q.add(t.right);
			 }
			 else
			 {
				 ans=Math.max(ans,temp);
				 temp=0;
				 if(!q.isEmpty())
					 q.add(null);
			 }
		 }
		 return ans;
          }