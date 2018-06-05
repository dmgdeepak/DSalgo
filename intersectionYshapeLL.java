 Idea is to find bigger list and make length equal then traverse until both nodes are equal
 
 int count(Node node,int c)
    {
         Node current = node;
        int count = 0;
 
        while (current != null) {
            count++;
            current = current.next;
        }
 
        return count;
    }
    int find(Node h,Node k,int d)
    {
        if(h==null ||k==null)
        return -1;
        while(d-->0)
        h=h.next;
        while(h!=null && k!=null)
        {
            if(h.data==k.data)
            return h.data;
            h=h.next;
            k=k.next;
            
        }
        return -1;
    }
	int intersectPoint(Node headA, Node headB)
	{
         int c1=count(headA,0);
         int c2=count(headA,0);
         //System.out.println(c1+" "+c2);
         return (c1>=c2)?find(headA,headB,c1-c2):find(headB,headA,c2-c1);
	}