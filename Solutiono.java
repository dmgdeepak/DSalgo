import java.io.*;
import java.util.*;
public class Solution {
private int v;
    private Queue<Integer> edge[];
    Solution(int V)
    {
        this.v=V;
        edge=new LinkedList[V];
        for(int i=0;i<v;i++)
        {
            edge[i]=new LinkedList();
        }
        
    }
    //
    public  void addEdge(int i,int x)
    {
        edge[i].add(x);
    }
    public  void bfs(int src)
    {
		System.out.print("src "+src);
        boolean visited[]=new boolean[v];
        int key[]=new int[v+1];
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(src);
         visited[src]=true;
        int j=1;
        key[src]=j;
        while(q.size()!=0)
        {
            int val=q.poll();
         Iterator<Integer>  itr= edge[val].iterator();
            while(itr.hasNext())
            {
                int temp=(int)itr.next();
                if(!visited[temp]){
                visited[temp]=true;
                q.add(temp);
                key[temp]=j;}
            }
            j++;
        }
        for(int x=1;x<=v;x++)
        {
            if(x!=src){
            if(key[x]==0)
                System.out.print("-1 ");
                else
                    System.out.print(6*key[x]+" ");
            }
        }
    }
    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ab=new Scanner(System.in);
        int t=ab.nextInt();
        while(t-->0)
        {
            int vertices=ab.nextInt();
            int edg=ab.nextInt();
            Solution g=new Solution(vertices);
            while(edg-->0)
            {
                g.addEdge(ab.nextInt(),ab.nextInt());
            }
            g.bfs(ab.nextInt());
        }
    }
}