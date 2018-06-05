/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// A Binary Search Tree node
/*class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    int c=0;
    //flag=false for left traversal
    void getcount(Node root,int low,int high)
{
    if(root==null)
    return;
    if(root.data>low && root.data<high)
    ++c;
    if(root.data<low)
    getcount(root.right,low,high);
    else if(root.data>high)
    getcount(root.left,low,high);
    else
    {
        getcount(root.left,low,high);
        getcount(root.right,low,high);
    }
}
    int getCountOfNode(Node root, int low, int high) 
    {
        getcount(root,low,high);
        return c;
    }
}