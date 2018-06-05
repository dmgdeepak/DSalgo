/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class GfG
{
    static ArrayList<String> arr=new ArrayList<String>();
    public static  void pre(Tree root,String str)
    {
        if(root==null)
        return ;
        if(root.left==null && root.right==null)
        {
            arr.add(str+root.data);
            return;
        }
        if(root.left!=null)
        pre(root.left,str+root.data);
        if(root.right!=null)
        pre(root.right,str+root.data);
    }
	public static int treePathsSum(Tree root)
        {
         pre(root,new String());
         for(String s:arr)
         System.out.println(s);
         return 0;
	}
}