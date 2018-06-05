idea is to use two pointers.
Move first n times
When first is null then it means another is pointing to nth node from last

int getNthFromLast(Node head, int n)
    {
	int count=0;
	Node m=head,nt=head;
	if(head==null)
	return -1;
	while(++count<n)
	{
	    m=m.next;
	    if(m==null)
	    return -1;
	}
	while(m.next!=null)
	{
	    m=m.next;
	    nt=nt.next;
	}
	return nt.data;
    }