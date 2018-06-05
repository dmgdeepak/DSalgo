class mstweight
{
int v;
LinkedList<Integer> lst[];
mstweight(int V)
{
v=V;
lst=new LinkedList[V];
for(int i=0;i<V;i++)
lst[i]=new LinkedList();
}
void addEdge(int x,int y)
{
	lst[x].add(y);
}
}