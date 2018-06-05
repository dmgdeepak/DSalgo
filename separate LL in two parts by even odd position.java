 Node rearrange(Node head)
    {
        if(head==null)
        return head;
        Node h=head;
          Node t=head.next;
          Node st=t;
          while(t!=null && t.next!=null && head!=null)
          {
              head.next=t.next;
              head=head.next;
              if(head.next==null)
              {
                  t.next=null;
                  break;
              }
              t.next=head.next;
                  t=t.next;
              
          }
          
                  head.next=st;
          return h;
     }