void linksort(Node head)
{
Node t=new Node(0);
Node t2=new Node(0);
Node t3=new Node(0);
Node h=t;
Node h2=t2;
Node h3=t3;
while(head!=null)
{
	int data=head.value;
	switch(data)
	{
		case 0:
		t.next=head;
		t=t.next;
		break;
		case 1:
		t2.next=head;
		t2=t2.next;
		break;
		case 2:
		t3.next=head;
		t3=t3.next;
		break;
	}
	head=head.next;
}
t.next=(h2.next!=null)?h2.next:h3.next;
t2.next=h3.next;
t3.next=null;
head= h.next;
}  