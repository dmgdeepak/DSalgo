/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfG
{
    public void diagonalsum(Node root)
     {
      Queue<Node> q1=new LinkedList<Node>();
      Queue<Node> q2=new LinkedList<Node>();
	  boolean flag=true;
	  q1.add(root);
	  while(!q1.isEmpty() || !q2.isEmpty())
	  {
		  int c=0;
		  if(flag)
		  {
			  while(!q1.isEmpty())
				{
			  Node temp=q1.poll();
			  while(temp!=null)
			  {
				  c+=temp.data;
				  if(temp.left!=null)
				  q2.add(temp.left);
			  temp=temp.right;
				}}
			  System.out.print(c+" ");
		  }
		  else {
				while(!q2.isEmpty())
				{
			 Node temp=q2.poll();
			  while(temp!=null)
			  {
				  c+=temp.data;
				  if(temp.left!=null)
				  q1.add(temp.left);
			  temp=temp.right;
		  }}
			  System.out.print(c+" ");
		  }
		  flag=!flag;
	  }
     }
}