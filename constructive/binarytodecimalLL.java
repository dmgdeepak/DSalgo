
/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */
class gfg
{
   long DecimalValue(Node head)
   {
 	long res=0;
 	while(head!=null)
 	{
 	    res=((res<<1)%1000000007+head.data)%1000000007;
 	    head=head.next;
 	}
 	return res%1000000007;
   }
}