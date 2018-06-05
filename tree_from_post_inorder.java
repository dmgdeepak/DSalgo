int index;
	int search(int arr[],int start,int end,int x)
	{
	    int i;
	    for(i=start;i<=end;++i)
	    {
	        if(x==arr[i])
	        break;
	    }
	    return i;
	}
	Node makeTree(int in[],int post[],int start,int end)
	{
	    if(start>end)
	    return null;
	    Node n=new Node(post[index]);
	    --index;
	    if(start==end)
	    return n;
	    int loc=search(in,start,end,n.data);
	    n.right=makeTree(in,post,1+loc,end);
	    n.left=makeTree(in,post,start,loc-1);
	    return n;
	}
        Node buildTree(int in[], int post[], int n)
	{
           index=n-1;
          return  makeTree(in,post,0,n-1);
	}