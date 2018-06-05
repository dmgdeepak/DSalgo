/*
http://practice.geeksforgeeks.org/problems/maximum-difference/1
*/


class dmg
{
    void fillArray(int a[],int arr[],int n)
    {
        Stack<Integer> stk=new Stack<Integer>();
        arr[0]=0;
        stk.push(a[0]);
        for(int i=1;i<n;++i)
        {
            while(!stk.isEmpty() && stk.peek()>=a[i])
            stk.pop();
            //now stack is having less than a[0] 
            if(!stk.isEmpty())
            arr[i]=stk.peek();
            else
            arr[i]=0;
            stk.push(a[i]);
        }
        
    }
    void reverse(int arr[],int n)
    {
        for(int i=0;i<n/2;++i)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    int findMaxDiff(int a[], int n)
    {
	int ls[]=new int[n]	;
	fillArray(a,ls,n);
	int rs[]=new int[n];
	reverse(a,n);
	fillArray(a,rs,n);
	int ans=Integer.MIN_VALUE;
	for(int i=0;i<n;++i)
	{
	    ans=Math.max(ans,Math.abs(ls[i]-rs[n-i-1]));
	}
/*	for(int h:ls)
	System.out.print(h+" ");
	System.out.println();
	for(int h:rs)
	System.out.print(h+" ");*/
	return ans;
    }
}