/*
RBT RULES:
No parent child can be Red
no. of black nodes in every path from root to node with less than 2 child must be same
Root node will be of black color

Insert node with color Red

Rebalancing:
Case 1 :If parent is black
Done

Case 2 :If parent and parent's sibling is of red color :
change color of both nodes and recheck

Case 3: If parent and parent's sibling is of diff color or doesn't exist :
Rotate,Recolor

For simplicity RBT maintains pointer to parent node
*/
insert(Node root,int key)
{
  if(root==null)
  return new node(key,black);//color of root will be black
  Node res=BSTInsert(root,key);
  if(res.parent.color==RED && sibling(res.parent).color==RED)
  {
    if(res.parent.parent==root)
    change color to black
    else
  {  change color
    res=res.parent.parent;
  }
  }
}
