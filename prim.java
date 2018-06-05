import java.util.*;
//import static  java.lang.*;
class prim
{
	private static int v;
	prim(int V)
	{
		this.v=V;
	}
	public static int extract_min(boolean visited[],int key[])
	{
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int i=0;i<key.length;i++)
		{
			if(!visited[i] && min>key[i])
			{
				min=key[i];
				min_index=i;
			}
		}
		return min_index;
	}
	  
	public static void primMST(int graph[][])
	{
		boolean visited[]=new boolean[v];
		int key[]=new int[v];
		int parent[]=new int[v];
		//set key to infinite and visited = false
		for(int i=0;i<v;i++)
		{
			key[i]=Integer.MAX_VALUE;
			visited[i]=false;
		}
		key[0]=0;
		parent[0]=-1;
		for(int i=0;i<v-1;i++)
		{
				int min_index=extract_min(visited,key);
				visited[min_index]=true;
				for(int j=0;j<v;j++)
				{
					if(!visited[j] && graph[min_index][j]!=0 && key[j]>graph[min_index][j])
					{
						parent[j]=min_index;
						key[j]=graph[min_index][j];
						
					}
				}
		}
	//	primMST(parent,v,graph);
	System.out.println("Edge   Weight");
        for (int i = 1; i < v; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               graph[i][parent[i]]);
	}
	public static void main(String args[])
	{
		prim g=new prim(5);
		 /* Let us create the following graph
           2    3
        (0)--(1)--(2)
        |    / \   |
        6| 8/   \5 |7
        | /      \ |
        (3)-------(4)
             9          */
       // prim t = new MST();
        int graph[][] = new int[][] {{0, 2, 0, 6, 0},
                                    {2, 0, 3, 8, 5},
                                    {0, 3, 0, 0, 7},
                                    {6, 8, 0, 0, 9},
                                    {0, 5, 7, 9, 0},
                                   };
 
        // Print the solution
        g.primMST(graph);
	}
}