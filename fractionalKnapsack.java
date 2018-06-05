import java.util.*;
import java.lang.*;
import java.io.*;
class knap
{
    int value;
    int wt;
    float density;
}
class GFG
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int w=ab.nextInt();
	    double ans=0;
	    knap arr[]=new knap[n];
	    for(int i=0;i<n;i++)
	    {arr[i]=new knap();
	    arr[i].value=ab.nextInt();
	        arr[i].wt=ab.nextInt();
	        arr[i].density=arr[i].value/arr[i].wt;
	    }
	    Arrays.sort(arr,new Comparator<knap>()
	    {
	        @Override
	        public int compare(knap a,knap b)
	        {
	            if(b.density!=a.density)
	            return (int)(b.density-a.density);
	            return (int)(b.value-a.value);
	            
	        }
	        });
	       // System.out.println(w);
	    for(int i=0;i<n && w>0;i++)
	    {
	        if(w>=arr[i].wt)
	        {
	            ans+=arr[i].value;
	            w-=arr[i].wt;
	        }
	        else
	        {
	            ans+=((double)arr[i].value/arr[i].wt)*w;
	            w=0;
	        } 
	        
	       // System.out.println("val "+arr[i].value+" wt "+arr[i].wt+" density "+arr[i].density);
	} 
	
/*	int curWeight = 0; // Current weight in knapsack
	double finalvalue = 0.0; // Result (value in Knapsack)

	// Looping through all Items take greedily
	for (int i = 0; i < n; i++) {
	    // If adding Item won't overflow, add it completely
	    if (curWeight + arr[i].wt <= w) {
		curWeight += arr[i].wt;
		finalvalue += arr[i].value;
	    }

	    // If we can't add current Item, add fractional part of it
	    else {
		int remain = w - curWeight;
		finalvalue += arr[i].value * ((double) remain / arr[i].wt);
		break;//
	    }
	} */
	System.out.println(ans);
	 }
}
}