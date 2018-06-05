Node mergeSort(Node h)
{
	//only one element ( length of ll is <=1)
if(h==null || h.next==null)
	return h;
}
Node first=split(h);
Node second=half->next;
half->next=null;
//recur for left and right ll as we need two separate LL to sort and merge
Node left=mergeSort(first);
Node right=mergeSort(second);
return merge(left,right);
}
//divide LL in two parts
Node split(Node h)
{
	if(h==null)
		return h;
	Node fast=h;
	Node slow=h;
	while(fast.next!=null && fast.next.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
	}
	return slow;

	}
	//only mapping is changed 
	//if a is small make its next to next smaller node and so on
Node merge(Node a,Node b)
{
	Node res;
	if(a==null)
		return b;
	if(b==null)
		return a;
	if(a.data<b.data)
	{
		res=a;
		res.next=merge(a.next,b);
	}
	else
	{
		res=b;
		res.next=merge(a,b.next);
	}
	return res;
}