import java.util.*;
import java.lang.*;
class graphbfs
{
	private int v; // no. of the vertex
	private LinkedList<Integer> arr[];
	graphbfs(int V)
	{
		this.v=V;
		arr=new LinkedList[v];
		for(int i=0;i<V;i++)
			arr[i]=new LinkedList();
	}
	void addEdge(int x,int y)
	{
		arr[x].add(y);
	}
	void BFS(int x)
	{
		boolean visited[]=new boolean[v];
		LinkedList<Integer> q=new LinkedList<Integer>();
		q.add(x);
		visited[x]=true;
		while(q.size()!=0)
		{
			x=q.poll();
			System.out.print(x+" ");
			Iterator<Integer> itr=arr[x].listIterator();
			while(itr.hasNext())
			{
				int temp=(int)itr.next();
				if(!visited[temp])
				{
					q.add(temp);
					visited[temp]=true;
				}
			}
		}
	}
	public static void main(String args[])
	{
	graphbfs g=new graphbfs(5);
	g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");

        g.BFS(2);

	}
}