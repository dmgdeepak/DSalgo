
class mergeLLReverse
{
    Node mergeResult(Node node1, Node node2)
    {
	if(node1==null)	
	return node2;
	Node res=null;
	if(node2==null)	
	return node1;
	while(node1!=null && node2!=next)
	{
		if(node1.data<=node2.data)
		{
			Node temp=node1.next;
			node1.next=res;
			res=node1;
			node1=temp;
		}else
		{
			Node temp=node2.next;
			node2.next=res;
			res=node2;
			node2=temp;
		}
	}
	while(node1!=null)
	{
		Node temp=node1.next;
		node1.next=res;
		res=node1;
		node1=temp;
	}while(node2!=null)
	{
		Node temp=node2.next;
		node2.next=res;
		res=node2;
		node2=temp;
	}
	return res;
    }
}
