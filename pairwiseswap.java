/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*
  Pairwise swap a linked list
  The input list will have at least one element  
  node is defined as 
  struct node
  {
     int data;
     struct node *next;
  }
*/
void pairWiseSwap(struct node *head)
{
   // The task is to complete this method
   struct node *prev=NULL;
   struct node *h=head;
   bool flag=false;
   while(h)
   {
       if(flag)
       {
           struct node *temp=prev;
           prev->next=h->next;
           h->next=temp;
           h=prev;
       }
       flag=!flag;
       prev=h;
       h=h->next;
   }
}