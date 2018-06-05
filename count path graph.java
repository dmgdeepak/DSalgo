import java.util.*;
import java.lang.*;
import java.io.*;
class graph
{
    int v;
    graph(int v)
    {
        this.v=v;
        
    }
    void addEdge(int x,int y)
    {
        arr[x].add(y);
        arr[y].add(x);
    }
    int path(int x,int y)
    {
        int c=0;
        boolean visited=new boolean[v];
        Iterator<Integer> itr=arr[x].listIterator();
        while(itr.hasNext())
        {
            int node=itr.next();
           visited[node]=true;
           
           if(node==y)
           ++c;
           else if(!visited[node])
           c+=path(node,y);
        }
        return c;
    }
}
class count_path
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int v=ab.nextInt();
	    int e=ab.nextInt();
	    graph a=new graph(v);
	    for(int i=0;i<e;++i)
	    a.addEdge(ab.nextInt(),ab.nextInt());
	    
	    System.out.println(a.path(ab.nextInt(),ab.nextInt()));
	}
	 }
}