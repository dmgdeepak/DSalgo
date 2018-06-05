	Node sortedList(Node head)
	{
	    Node h=head;
		while(head.next!=null)
		{
		    Node n=head.next;
		    if(n.data<head.data)
		    {
		        head.next=n.next;
		        n.next=h;
		        h=n;
		    }
		    head=head.next;
		}
		return h;
	}