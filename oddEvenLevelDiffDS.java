/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// A Binary Tree node
/* class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}  */
class oddEvenLevelDiffDS
{   /*You are required to complete this function*/
    int getLevelDiff(Node root)
    {
        if(root==null)
        return 0;
        return root.data-getLevelDiff(root.left)-getLevelDiff(root.right);
    }
}