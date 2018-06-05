Node LCA(Node root, int n1,int n2)
 {
  if(root==null)
  return null;
  if(root.data==n1 || root.data==n2)
  return root;
 Node left=LCA(root.left,n1,n2);
 Node right= LCA(root.right,n1,n2);
  if(left!=null && right!=null)
  return root;
  return (left!=null)?left:right;
 }
 //find distance from common node
 int level(Node root,int a,int level)
 {
     if(root==null)
     return -1;
     if(a==root.data)
     return level;
     int l=level(root.left,a,level+1);
     if(l==-1)
     return level(root.right,a,level+1);
     return l;
     
 }
    int findDist(Node root, int a, int b)
    {
        Node lca=LCA(root,a,b);
        return level(lca,a,0)+level(lca,b,0);
    }