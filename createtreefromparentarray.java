Node createTree(int parent[], int n) 
    {
	Node []visited=new Node[n];
	Arrays.fill(visited,null);
	for(int i=0;i<n;++i)
	{
		CreateTree(i,parent,visited);
	}
	}
	void CreateTree(int i,int [] parent,int [] visited)
	{
		if(visited[i]!=null)
			return;
		visited[i]=new Tree(i);
		//check if it is root node
		if(parent[i]==-1)
		{	root=visited[i];
		return;
	}
		//create parent if not exists
		if(visited[parent[i]]==null)
		{
			createTree(parent[i],parent,visited);
			
		}
		Node pnode=visited[parent[i]];
		if(pnode.left==null)
			pnode.left=visited[i];
		else
			pnode.right=visited[i];
	}