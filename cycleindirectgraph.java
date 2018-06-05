public boolean hasCycle(int v,LinkedList<Integer>[] alist,boolean[] visited,boolean[] explored) 
     {
       if(!visited[v])
       {
           visited[v]=true;
           explored[v]=true;
           Iterator<Integer> itr=alist[v].listIterator();
           while(itr.hasNext())
           {
               int temp=itr.next();
               if(visited[temp] && hasCycle(temp,alist,visited,explored))
               return true;
               if(explored[temp])
               return true;
           }
       }
       explored[v] = false;
       return false;
     }