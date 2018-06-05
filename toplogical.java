class topological
{
        public static void topo(ArrayList<Integer> arr[],Stack<Integer> stk,int n,boolean visited[])
        {
            visited[n]=true;
            Iterator<Integer> itr=arr[n].iterator();
            while(itr.hasNext())
            {
                int val=itr.next();
                if(!visited[val])
                topo(arr,stk,val,visited);
            }
                       //pushing at last  because u need to traversed before v 
            stk.push(n);
        }
         public static int[] topoSort(ArrayList<Integer> graph[],int N)
         {
             Stack<Integer> stk=new Stack<Integer>();
             boolean visited[]=new boolean[N];
             Arrays.fill(visited,false);
         for(int i=0;i<N;i++)
         {
             if(!visited[i])
             topo(graph,stk,i,visited);
         }
         int arr[]=new int[N];
         for(int i=0;i<N && stk.size()>0;i++)
         arr[i]=stk.pop();
         return arr;
         }
}