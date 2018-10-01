/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*
class Node {
   int data;
   Node next;
  Node(int data) {
      this.data = data;
  }
}
public class LinkedList
{
    Node head;
    // Member Methods
}*/
/* This is method only submission.
You only need to complete the below method.*/
class GfG
{
   Node Reverse(Node head) {
Node prev=null;
    Node next=null;
    Node cur=head;
    while(cur!=null)
    {
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
       
    }
    head = prev;
        return head;
}
    void compute(LinkedList l)
    {
 Node r=Reverse(l.head);
 int max=r.data;
 Node cur=r;
 while(cur.next!=null)
 {
     if(cur.next.data<max)
     cur.next=(cur.next!=null)?cur.next.next:null;
     else
     {max=cur.next.data;
         cur=cur.next;}
 }
  l.head=Reverse(r);
    }
}
  
  // method 2
  Node *compute(Node *head)
{ if(head->next==NULL)
return head;
struct Node *temp=compute(head->next);
if(temp->data > head->data)
return temp;
else
head->next=temp;
return head;
}