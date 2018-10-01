/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int t2Sum(TreeNode A, int k) {
      Stack<TreeNode>s=new Stack<>();
      Stack<TreeNode>s2=new Stack<>();
      int a=0,b=0;
      TreeNode cur=A,cur2=A;
      boolean f=false,f2=false;
      while(true)
      {
              while(!f)
              {
                if(cur!=null)
                {
                  s.push(cur);
                  cur=cur.left;
                }
                else
                {
                    if(s.isEmpty())
                    f=true;
                    else{
                  f=true;
                  a=s.peek().val;
                  cur=s.pop().right;}
                }
              }
              while(!f2)
              {
                if(cur2!=null)
                {
                  s2.push(cur2);
                  cur2=cur2.right;
                }
                else
                {
                     if(s2.isEmpty())
                    f2=true;
                    else{
                  f2=true;
                  b=s.peek().val;
                  cur2=s.pop().left;}
                }
              }
              if(a!=b && a+b==k)
              return 1;
              if((a+b)<k)
              f=false;
              else if((a+b)>k)
              f2=false;
              else if(a>=b)
              return 0;
      }
    }
}
