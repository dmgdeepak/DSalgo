import java.util.*;
import java.lang.*;
import java.io.*;

class graph
{
	static int c=0;
    int v;
   LinkedList<Integer> arr[];
    graph(int v)
    {
        this.v=v;
        arr=new LinkedList[v];
		for(int i=0;i<v;++i)
			arr[i]=new LinkedList();
    }
    void addEdge(int x,int y)
    {
        arr[x].add(y);
      //  arr[y].add(x);
    }
    void path(int x,int y,boolean visited[])
    {
        //int c=0;
        
           visited[x]=true;
		   
           if(x==y)
           ++c;
	   else
	   {
        Iterator<Integer> itr=arr[x].listIterator();
        while(itr.hasNext())
        {
            int node=(int)itr.next();
           
           if(!visited[node])
          path(node,y,visited);
	}}
		visited[x]=false;
       // return c;
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
	    a.path(ab.nextInt(),ab.nextInt(),new boolean[v]);
	    System.out.println(a.c);
	}
	 }
}