/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */
class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	if(node1==null)	
	return node2;
	if(node2==null)	
	return node1;
	Node head=null,prev=null;
	while(node1!=null && node2!=null)
	{
	    if(node1.data<=node2.data)
	    {
	        if(head==null)
	        head=node1;
	        if(prev!=null)
	        prev.next=node1;
	        prev=node1;
	        node1=node1.next;
	    }
	    else
	    {
	         if(head==null)
	        head=node2;
	        if(prev!=null)
	        prev.next=node2;
	        prev=node2;
	        node2=node2.next;
	    }
	}
	if(node1==null)
	prev.next=node2;
	if(node2==null)
	prev.next=node1;
	return head;
    }
}
