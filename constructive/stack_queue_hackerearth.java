/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
leftsum[i] sum till i from 0
rightsum[i] sum till i from n
we need to find x s.t. leftsum till x and rightsum till k-x is max
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class stack_queue_hackerearth{
//class TestClass {
  public static int maxSum(int a[],int n,int k)
  {
    int lsum[]=new int[n];
    int rsum[]=new int[n];
    lsum[0]=a[0];
    rsum[n-1]=a[n-1];
    for(int i=1;i<n;++i)
    lsum[i]=lsum[i-1]+a[i];
    for(int i=n-2;i>=0;--i)
    rsum[i]=rsum[i+1]+a[i];
    int res=Math.max(lsum[k-1],rsum[n-k]);
    int cur=Math.max(lsum[k-1],rsum[n-k]);
    //System.out.println(k-1+" "+(n-k));
    for(int i=0;i<k-1;++i)
    {
    //  System.out.println(i+" "+(n-(k-i-1)));
      cur=lsum[i]+rsum[n-(k-i-1)];
      res=Math.max(res,cur);
    }
    return res;
  }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        Scanner ab = new Scanner(System.in);
        int n=ab.nextInt();
        int k=ab.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;++i)
        a[i]=ab.nextInt();
        System.out.println(maxSum(a,n,k));
    }
}
