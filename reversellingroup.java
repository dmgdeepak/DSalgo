
Node reverse(Node head,int k)
{
	if(head==null)
		return null;
	int c=0;
	Node h=head;
	Node prev=null,next;
	while(c<k && head!=null)
	{
		next=head.next;
		head.next=prev;
		prev=head;
		head=next;
		++c;
	}
	if(next!=null)
	h.next=reverse(next,k);
	return prev;
}