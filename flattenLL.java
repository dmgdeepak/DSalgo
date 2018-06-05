/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	    Node cur = root.next; Node head = root;
	    while(cur!=null){
	        head = merge(head, cur);
	        cur = cur.next;
	    }
	    return head;
    }
    
    Node merge(Node h1, Node h2){
        if(h1==null) return h2;
        if(h2==null) return h1;
        Node head = null;
        if(h1.data < h2.data){
            head = h1;
            head.bottom = merge(h1.bottom, h2);
        }
        else{
            head = h2;
            head.bottom = merge(h1, h2.bottom);
        }
        return head;
    }
}

1
2
11 17 
163 187 374 463 560 577 652 771 836 927 978 153 163 170 187 237 290 351 374 463 560 577 652 771 797 836 927 978 
