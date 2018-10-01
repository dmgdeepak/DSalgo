//sort array
// in average find closest val x from from sum[i]
// x : k*i
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class averagehackrearh{
//class TestClass {
  public static int maxlength(int a[],int avg,int n)
  {
    int res=0,sum=0;
    int c=0;
    for(int i=0;i<n;++i)
    {
      if(sum+a[i]<avg*(c+1))
      {
        ++c;
      sum+=a[i];
      }
      else if(sum!=0)
      {
        sum=sum-a[i-c]+a[i];
      }
    //  System.out.println("c "+c+" sum "+sum+" i "+i);
      res=Math.max(res,c);
    }
    return res;
  }
  public static int maxlengthnlogn(int a[],int sum[],int avg,int n)
  {
    int res=0,mid=0,resi=0;
    for(int i=1;i<n;++i)
    {
      int l=0,r=i-1;
      while(l<=r)
      {
         mid=(r-l)/2+l;
        if(Math.ceil((sum[i]-sum[mid])/(i-mid+1))<avg)
        {
          if(res<i-mid+1)
          {
            res=i-mid+1;
            resi=i;
          }
          r=mid-1;
        }
        else
        l=mid+1;
      }
    }
    System.out.print(mid+" "+resi);
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
        int a[]=new int[n];
        for(int i=0;i<n;++i)
        a[i]=ab.nextInt();
        int k=ab.nextInt();
        int q[]=new int[k];
        for(int i=0;i<k;++i)
        q[i]=ab.nextInt();
        int sum[]=new int[n];
        sum[0]=a[0];
        for(int i=1;i<n;++i)
        sum[i]=sum[i-1]+a[i];
        for(int i=0;i<k;++i)
        System.out.println(maxlength(a,q[i],n));
    }
}
