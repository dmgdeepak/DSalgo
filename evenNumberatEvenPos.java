import java.util.*;
import java.lang.*;
import java.io.*;
class evenNumberatEvenPos
 {
   public static int getEvenPos(int a[],int n,int start)
   {
     //if(start)
     for(int i=start;i<n;i+=2)
     {
       if(a[i]%2==0)
       return i;
     }
     return -1;
   }
   	public static void manipulate(int a[],int n)
    {
      int pos=getEvenPos(a,n,1);
      for(int i=0;i<n;i+=2)
      {
        if(pos==-1)
        break;
        if(a[i]%2!=0)
        {
          int temp=a[i];
          a[i]=a[pos];
          a[pos]=temp;
          pos=getEvenPos(a,n,i+1);
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
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
      manipulate(arr,n);
      for(int x:arr)
      System.out.print(x+" ")  ;
	    System.out.println();
	}
	 }
}
