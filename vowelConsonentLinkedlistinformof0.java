
class GfG{
    public Node moveZeroes(Node head){
       if(head==null)
       return head;
       Node root=head;
       Node newhead=null;
       Node latestZero=null;
       if(head.data==0)
       {
           System.out.print("head 0");
           latestZero=newhead=head;
       }
       else
       {
           Node prev=null;
           while(head!=null && head.data!=0)
           {
               prev=head;
               head=head.next;
           }
           if(head==null)
           return root;
           prev.next=head.next;
           latestZero=newhead=head;
           latestZero.next=root;
           head=prev.next;
       }
      /* while(head!=null)
      { if(head.data==0)
       {
           latestZero.next=head;
           Node headnext=head.next;
           head.next=root;
           head=headnext;
       }
         else
         head=head.next;
      }*/
       return newhead;
    }
}
