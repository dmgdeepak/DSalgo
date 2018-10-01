/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the Function Provided
Node is as follows:
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class GfG{
	public static void swap(Node head1,Node head2)
	{
		Node ttemp=head1;
		head1=head2;
		head2=ttemp;
	}
	public static void zigzag(Node head){
boolean flag=true;
while(head.next!=null)
{
	if(flag)
	{
		if(head.data>head.next.data)
			{int te=head.data;
			    head.data=head.next.data;
			    head.next.data=te;
			}
	}
	else
	{
		if(head.data<head.next.data)
			{int te=head.data;
			    head.data=head.next.data;
			    head.next.data=te;}
	}
	System.out.print(head.data+" ");
	head=head.next;
	flag=!flag;
}
	System.out.println(head.data);
}}