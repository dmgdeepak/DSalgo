/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    void fillArray(int a[],int arr[])
    {
        Stack<Integer> stk=new Stack<Integer>();
        arr[0]=0;
        stk.push(a[0]);
        for(int i=1;i<a.length;++i)
        {
            while(!stk.isEmpty() && stk.peek()>=a[0])
            stk.pop();
            //now stack is having less than a[0] 
            if(!stk.isEmpty())
            arr[i]=stk.peek();
            else
            arr[i]=0;
            stk.push(a[i]);
        }
        
    }
    int findMaxDiff(int a[], int n)
    {
	int ls[]=new int[n]	;
	fillArray(a,ls);
	for(int h:ls)
	System.out.print(h+" ");
	return 0;
    }
}