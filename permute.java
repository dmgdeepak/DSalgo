import java.util.*;
import java.lang.*;
import java.io.*;
class permute
 {
	// static in=5;
    static String hashTable[] = {"", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
	public static void show(int arr[],StringBuffer Output,int cur,int n)
	{
		System.out.println(cur);
	    if(cur>=n-1)
	    {
	        System.out.println(Output);
	        return;}
	    else
	    {
	        for(int i=0;i<hashTable[arr[cur]].length();i++)
	        {
	            Output.setCharAt(cur,hashTable[arr[cur]].charAt(i));
	            show(arr,Output,cur+1,n);
	        if (arr[cur] == 0 || arr[cur] == 1)
            return;
	        }
	    }
	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=ab.nextInt();
	    StringBuffer g=new StringBuffer();
	    show(arr,g,0,n);
	}
	 }
}