
here after giving i was not able to directly find postOrder Traversal of Tree
As According to stack/queue less Traversal we link null pointer so that it can be used for Traversal
as if we go through pre/inorder Traversal (Morris) then we will get to traverse using root of subtree then after traversal we
unlink the null pointer
But in postOrder we need to go with left,right then node .
Hence we overcome a solution which uses reverse postOrder and in result array ,just reverse it.

Prerequisite :
Morris inorder/preorder traversal

Algorithm:
Link left null pointer of node to its postOrder Successor.
We first need to use root node so when we start with a node push into array
This can be acheived when
1: Linking nodes (add root node)
As when link is not there it means we are visiting that node for first time so link and add
Second time visit just unlink and go to left subtree
2: Leaf node  (add left node)

Base case:
Go for right node , if not exists then add into array and move to left subtree (This case will arise when we are at leaf node)

void morrisPostOrder(Node root)
{
  ArrayList<Node> a=new ArrayList<>();
  while(root!=null){
if(root.right==null)
{
   if right node does not exists then add into array and move to left subtree
  a.add(root.data);
  root=root.left;
}
else
{
  // go to last left node of temp and link / unlink
    Node temp=root.right;
    while(temp.left!=null && temp.left != root)
    temp=temp.left;
    //first visit ,link node and add into array
    if(temp.left==null)
    {
      temp.left=root;
      a.add(root.data);
      root=root.right;
    }
    //Second visit ,make tree as its orignal and move to left subtree of root
    else if(temp.left==root)
    {
      root=root.left;
      temp.left=null;
    }
}}
//print reverse of array
for(int i=a.size()-1;i>=0;--i)
System.out.print(a.get(i).data+" ");
}
