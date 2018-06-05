import java.util.*;
import static java.lang.System.out;

class graphdfs
{
	int v; // no. of vertex
	LinkedList<Integer> arr[];
	graphdfs(int V)
	{
		this.v=V;
		arr=new LinkedList[V];
		for(int i=0;i<V;i++)
			arr[i]=new LinkedList();
	}
	void addEdge(int x,int y)
	{
		arr[x].add(y);
	}
	void DFS(boolean visited[],int x)
	{
		visited[x]=true;
		out.print(x+" ");
		Iterator<Integer> itr=arr[x].listIterator();
		while(itr.hasNext())
		{
			int vertice = itr.next();
			if(!visited[vertice])
			DFS(visited,vertice);
		}
	}
	void DFS()
	{
		boolean visited[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
				DFS(visited,i);
		}
			
	}
	public static void main(String args[])
	{
		graphdfs g=new graphdfs(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal");
 
        g.DFS();
	}
}