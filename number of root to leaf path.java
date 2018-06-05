Idea is to use tree traversal and whenever a leaf node is detected put length and count into a map

 Map<Integer,Integer> map=new HashMap<Integer,Integer>();
 void path(Node root,int len)
 {
	 if(root==null)
	 return;
	 if(root.left==null && root.right==null)
	 {
		 if(map.containsKey(len))
		 map.put(len,map.get(len)+1);
	 else
		 map.put(len,1);
		 return;
	 }
	// if(root.left!=null)
	 path(root.left,len+1);
	//if(root.right!=null)
	 path(root.right,len+1);
 }
 void countPaths(Node root)
    {
	// map length - no. of path
	path(root,1);
	for(Map.Entry<Integer,Integer> m:map.entrySet())
	{
		System.out.print(m.getKey()+" "+m.getValue()+" $");
	}
    }