/*import java.util.*;
import java.lang.*;
import java.io.*;
class starSuperStar
 {
	 public static void starSuperStar(int arr[],int n)
	 {
		 //hold max arr[j]...arr[j+i]
		 int Rmax[]=new int[n];
		 //hold max arr[j-i].. arr[j]
		 int Lmax[]=new int[n];
		 Rmax[n-1]=arr[n-1];
		 for(int i=n-2;i>=0;--i)
		 {
			 Rmax[i]=Math.max(arr[i],Rmax[i+1]);
		 }
		 Lmax[0]=arr[0];
		 for(int i=1;i<n;++i)
		 {
			 Lmax[i]=Math.max(arr[i],Lmax[i-1]);
		 }
		for(int x:Rmax)
			 System.out.print(x+" ");
		 System.out.println();
		/* for(int x:Lmax)
			 System.out.print(x+" ");
			 System.out.print(Rmax[0]+" ");
			 for(int i=1;i<n;++i)
			 {
			     if(Rmax[i]!=Rmax[i-1])
			     System.out.print(Rmax[i]+" ");
			 }
			 System.out.println();
			 for(int i=0;i<n;++i)
			{ if(Lmax[i]==Rmax[i])
			 System.out.print(Rmax[i]+" ");}
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
		starSuperStar(arr,n);
	    System.out.println();
	}
	 }
}*/
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static void starSuperStar(int arr[],int n)
	 {
		 //hold max arr[j]...arr[j+i]
		 int Rmax[]=new int[n];
		 Rmax[n-1]=arr[n-1];
		 int max=arr[n-1];
		 for(int i=n-2;i>=0;--i)
		 {
			 Rmax[i]=Math.max(arr[i],Rmax[i+1]);
			 if(Rmax[i]==arr[i])
			 max=Rmax[i];
		 }
		 for(int x:Rmax)
			 System.out.print(x+" ");
		 System.out.println();
		/* for(int x:Lmax)
			 System.out.print(x+" ");*/
			 System.out.print(Rmax[0]+" ");
			 for(int i=1;i<n;++i)
			 {
			     if(Rmax[i]!=Rmax[i-1])
			     System.out.print(Rmax[i]+" ");
			 }
			 if(Rmax[0]==max)
			 System.out.print("\n"+max);
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
		starSuperStar(arr,n);
	    System.out.println();
	}
	 }
}