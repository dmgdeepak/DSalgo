import java.util.*;
import java.lang.*;
import java.io.*;
class preorderPost
 {
    static int in=0;
    static boolean flag=false;
    //check if it is valid representation of preorder
    //if so then all nodes ahead a[j] must be greater than a[l] 
    public static boolean checkIncreasing(int a[],int l,int j,int n)
    {
        for(int i=j+1;i<=n;++i)
        if(a[i]<a[l])
        {
            flag=true;
            return true;
        }
        return false;
    }
 	public static void pre2post(int a[],int l,int r,int p[])
 	{
 	    if(l>r) return;
    if(l==r){ p[in++]=a[l];
    return;}
    int j=l+1;
    for(;j<=r;++j)
    if(a[j]>a[l])
    break;
    if(checkIncreasing(a,l,j,r))
    return;
    pre2post(a,l+1,j-1,p);
    pre2post(a,j,r,p);
    p[in++]=a[l];
    return ;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    in=0;
	    flag=false;
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    int post[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
     // Integer in=new Integer(0);
      pre2post(arr,0,n-1,post);
      if(flag)
      System.out.print("NO");
      else{
      for(int x:post)
	    System.out.print(x+" ");}
	    System.out.println();

	}
	 }
}
