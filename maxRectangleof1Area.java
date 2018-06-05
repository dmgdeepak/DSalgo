
class maxRectangleof1Area{
	 public int histogram(int arr[],int n)
	 {
		 Stack<Integer> stk=new Stack<Integer>();
		 int area=Integer.MIN_VALUE,i=0,tmparea;
		 while(i<n)
		 {
			 if(stk.isEmpty() || arr[stk.peek()]<=arr[i]) 
				 stk.push(i++);
			 else
			 {
					 int item=arr[stk.pop()];
					 //this item is minimum height possible so area will be its number from start
					 tmparea=item*i;
					 //check if there is smaller element in stack then area will be upto that smaller element 
					 if(!stk.isEmpty())
					 tmparea=item*(i-stk.peek()-1); // -1 as we are not taking that element
					 area=Math.max(area,tmparea);
			 }
		 }
		 while(!stk.isEmpty())
		 {
			  int item=arr[stk.pop()];
					 tmparea=item*i;
					 //check if there is smaller element in stack then area will be upto that smaller element 
					 if(!stk.isEmpty())
					 tmparea=item*(i-stk.peek()-1); // -1 as we are not taking that element
					 area=Math.max(area,tmparea);
		 }
		 return area;
	 }
    public int maxArea(int a[][],int m,int n){
        int maxArea=histogram(a[0],n);
        for(int i=1;i<m;++i)
        {
            for(int j=0;j<n;++j)
            {
                if(a[i][j]>=1)
                a[i][j]+=a[i-1][j];
            }
        }
        for(int i=1;i<m;++i)
        {
            int tmp=histogram(a[i],n);
            if(maxArea<tmp)
            maxArea=tmp;
        }
        return maxArea;
    }
}