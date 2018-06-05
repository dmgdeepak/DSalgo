class ifpreorder
{
boolean ifpre(int pre[],int n)
{
	Stack<Integer> st=new Stack<Integer>();
int root=Integer.MIN_VALUE;
for(int i=0;i<pre.length;i++)	
{
	if(pre[i]<root)
		return false;
	while(st.size()>0 && pre[i]>st.peek())
	{
		root=st.pop();
		
	}
	st.push(pre[i]);
}
}
}