import java.util.*;
import java.lang.*;
import java.io.*;
class maxpositivearray
 {
   	public ArrayList<Integer> maxset(ArrayList<Integer> A) {
   	   int n=A.size();
   		 int resindex=0;
        long maxsum=-1,csum=0;
        int elecount=-1,curelecount=0;
        for(int i=0;i<n;++i)
        {
          if(A.get(i)>=0)
          {
            csum+=A.get(i);
            if(csum>maxsum)
            {
              maxsum=csum;
              resindex=i-curelecount;
              elecount=curelecount;
            }
            else if(csum==maxsum && elecount<curelecount)
            {
              resindex=i-curelecount;
              elecount=curelecount;
            }
            ++curelecount;
          }
          else
          {
            csum=0;
            curelecount=0;
          }
        }
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<=elecount && resindex+i<n ;++i)
        {
          res.add(A.get(resindex+i));
        }
        return res;
   	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(maxDiff(arr,n));
	}
	 }
}
